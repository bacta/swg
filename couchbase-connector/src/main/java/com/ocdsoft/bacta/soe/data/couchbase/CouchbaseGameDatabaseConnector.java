package com.ocdsoft.bacta.soe.data.couchbase;

import com.couchbase.client.CouchbaseClient;
import com.couchbase.client.CouchbaseConnectionFactory;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.ocdsoft.bacta.swg.shared.database.GameDatabaseConnector;
import com.ocdsoft.bacta.engine.conf.BactaConfiguration;
import com.ocdsoft.bacta.engine.object.NetworkObject;
import net.spy.memcached.ConnectionObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.SocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by kburkhardt on 2/23/14.
 */
@Singleton
public final class CouchbaseGameDatabaseConnector implements GameDatabaseConnector {

    private static final Logger LOGGER = LoggerFactory.getLogger(CouchbaseGameDatabaseConnector.class);
    private final CouchbaseNetworkObjectTranscoder transcoder;

    private CouchbaseClient client;

    @Inject
    public CouchbaseGameDatabaseConnector(final BactaConfiguration configuration, final CouchbaseNetworkObjectTranscoder transcoder) throws Exception {
        this.transcoder = transcoder;

        Properties systemProperties = System.getProperties();
        systemProperties.put("net.spy.log.LoggerImpl", "net.spy.memcached.compat.log.SLF4JLogger");
        System.setProperties(systemProperties);

        client = connect(
                configuration.getString("Bacta/Database/Couchbase", "Address"),
                configuration.getInt("Bacta/Database/Couchbase", "Port"),
                configuration.getString("Bacta/Database/Couchbase", "GameObjectsBucket"));

        init();
    }

    private void init() {

        try {
            if (client.get("NetworkId") == null) {
                client.add("NetworkId", String.valueOf(4294967296L));
            }

        } catch(Exception e) {

            LOGGER.error("Unable to initialize database", e);
            System.exit(1);
        }
    }

    /**
     * Connect to the server, or servers given.
     *
     * @param serverAddress the server addresses to connect with.
     * @throws java.io.IOException                 if there is a problem with connecting.
     * @throws java.net.URISyntaxException
     * @throws javax.naming.ConfigurationException
     */
    private CouchbaseClient connect(final String serverAddress, int port, final String bucket) throws Exception {


        URI base = new URI(String.format("http://%s:%s/pools", serverAddress, port));
        List<URI> baseURIs = new ArrayList<URI>();
        baseURIs.add(base);
        CouchbaseConnectionFactory cf = new CouchbaseConnectionFactory(baseURIs, bucket, "");

        CouchbaseClient client = new CouchbaseClient(cf);

        client.addObserver(new ConnectionObserver() {

            public void connectionLost(SocketAddress sa) {
                LOGGER.debug("Connection lost to " + sa.toString() + " '" + bucket + "'");
            }

            public void connectionEstablished(SocketAddress sa, int reconnectCount) {
                LOGGER.debug("Connection established with " + sa.toString() + " '" + bucket + "'");
                LOGGER.debug("Reconnected count: " + reconnectCount);
            }
        });

        return client;
    }

    @Override
    public long nextId() {
        return client.incr("NetworkId", 1);
    }


    @Override
    public <T extends NetworkObject> T get(String key) {
        return (T) client.get(key, transcoder);
    }

    @Override
    public <T extends NetworkObject> T get(long key) {
        return get(String.valueOf(key));
    }

    @Override
    public <T extends NetworkObject> void persist(T object) {
        client.set(String.valueOf(object.getNetworkId()), 0, object, transcoder);
    }
}
