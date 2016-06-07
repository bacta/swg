package com.ocdsoft.bacta.swg.server;

import com.google.inject.TypeLiteral;
import com.ocdsoft.bacta.engine.object.account.Account;
import com.ocdsoft.bacta.engine.service.object.ObjectService;
import com.ocdsoft.bacta.engine.service.objectfactory.NetworkObjectFactory;
import com.ocdsoft.bacta.soe.ServerState;
import com.ocdsoft.bacta.soe.io.udp.GameNetworkConfiguration;
import com.ocdsoft.bacta.soe.io.udp.NetworkConfiguration;
import com.ocdsoft.bacta.soe.service.OutgoingConnectionService;
import com.ocdsoft.bacta.swg.server.game.GameModule;
import com.ocdsoft.bacta.swg.server.game.GameServer;
import com.ocdsoft.bacta.swg.server.game.GameServerState;
import com.ocdsoft.bacta.swg.server.game.data.serialize.GameObjectByteSerializer;
import com.ocdsoft.bacta.swg.server.game.data.serialize.kryo.KryoSerializer;
import com.ocdsoft.bacta.swg.server.game.name.DefaultNameService;
import com.ocdsoft.bacta.swg.server.game.name.NameService;
import com.ocdsoft.bacta.swg.server.game.object.*;
import com.ocdsoft.bacta.swg.server.game.object.intangible.IntangibleObject;
import com.ocdsoft.bacta.swg.server.game.object.intangible.IntangibleObjectInitializer;
import com.ocdsoft.bacta.swg.server.game.object.intangible.player.PlayerObject;
import com.ocdsoft.bacta.swg.server.game.object.intangible.player.PlayerObjectInitializer;
import com.ocdsoft.bacta.swg.server.game.object.tangible.TangibleObject;
import com.ocdsoft.bacta.swg.server.game.object.tangible.TangibleObjectInitializer;
import com.ocdsoft.bacta.swg.server.game.object.tangible.creature.CreatureObject;
import com.ocdsoft.bacta.swg.server.game.object.tangible.creature.CreatureObjectInitializer;
import com.ocdsoft.bacta.swg.server.game.object.tangible.factory.GuiceNetworkObjectFactory;
import com.ocdsoft.bacta.swg.server.game.service.data.SetupSharedFile;
import com.ocdsoft.bacta.swg.server.game.service.data.SharedFileService;
import com.ocdsoft.bacta.swg.server.game.service.object.ServerObjectService;
import com.ocdsoft.bacta.swg.server.game.zone.PlanetMap;
import com.ocdsoft.bacta.swg.server.game.zone.ZoneMap;
import com.ocdsoft.bacta.swg.server.login.object.SoeAccount;
import com.ocdsoft.bacta.swg.shared.container.SlotIdManager;
import com.ocdsoft.bacta.swg.shared.template.ObjectTemplateList;

class BaseGameModule extends GameModule {

    @Override
    protected void configure() {

        bind(ScriptService.class).asEagerSingleton();
        bind(SetupSharedFile.class).asEagerSingleton();
        bind(SharedFileService.class).asEagerSingleton();
        bind(SlotIdManager.class).asEagerSingleton();

        //ServerObject initializers.
        bind(new TypeLiteral<ObjectInitializer<ServerObject>>() {}).to(ServerObjectInitializer.class);
        bind(new TypeLiteral<ObjectInitializer<TangibleObject>>() {}).to(TangibleObjectInitializer.class);
        bind(new TypeLiteral<ObjectInitializer<CreatureObject>>() {}).to(CreatureObjectInitializer.class);
        bind(new TypeLiteral<ObjectInitializer<IntangibleObject>>() {}).to(IntangibleObjectInitializer.class);
        bind(new TypeLiteral<ObjectInitializer<PlayerObject>>() {}).to(PlayerObjectInitializer.class);

        bind(ObjectInitializerProvider.class).to(GuiceObjectInitializerProvider.class);

        bind(NetworkConfiguration.class).to(GameNetworkConfiguration.class);
        bind(OutgoingConnectionService.class).to(GameServer.GameOutgoingConnectionService.class);
        bind(GameServerState.class).to(PreCuGameServerState.class);
        bind(NetworkSerializer.class).to(GameObjectSerializer.class);
        bind(new TypeLiteral<ObjectService<ServerObject>>() {}).to(ServerObjectService.class);
        bind(ObjectService.class).to(ServerObjectService.class);
        bind(NetworkObjectFactory.class).to(GuiceNetworkObjectFactory.class);
        bind(GameObjectByteSerializer.class).to(KryoSerializer.class);

        bind(NameService.class).to(DefaultNameService.class);
        bind(ZoneMap.class).to(PlanetMap.class);
        bind(GameServerState.class).to(PreCuGameServerState.class);
        bind(ServerState.class).to(PreCuGameServerState.class);
        bind(NameService.class).to(DefaultNameService.class);
        bind(PublisherService.class).to(GamePublisherService.class);

        bind(ObjectTemplateList.class).to(PreCuObjectTemplateList.class);

        // TODO: Remove later
        bind(Account.class).to(SoeAccount.class);
    }

}
