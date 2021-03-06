package com.ocdsoft.bacta.swg.server.game.object;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.ocdsoft.bacta.engine.object.NetworkObject;
import com.ocdsoft.bacta.swg.server.game.object.template.server.ServerObjectTemplate;
import com.ocdsoft.bacta.swg.shared.container.SlotIdManager;
import com.ocdsoft.bacta.swg.shared.object.GameObject;
import com.ocdsoft.bacta.swg.shared.template.ObjectTemplateList;

import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by kyle on 6/5/2016.
 */
@Singleton
public final class GameObjectConstructorMap {

    private final Map<Class, Constructor> constructorMap;

    @Inject
    public GameObjectConstructorMap() {
        constructorMap = new ConcurrentHashMap<>();
    }

    public <T extends GameObject> Constructor<T> get(final Class<T> clazz) {

        Constructor<T> constructor = constructorMap.get(clazz);
        if(constructor == null) {
            try {
                constructor = clazz.getConstructor(ObjectTemplateList.class, SlotIdManager.class, ServerObjectTemplate.class);
                constructorMap.put(clazz, constructor);

            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        return constructor;
    }
}
