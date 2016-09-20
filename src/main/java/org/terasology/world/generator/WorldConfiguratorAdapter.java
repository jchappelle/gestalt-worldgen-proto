/*
 * Copyright 2014 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.world.generator;

import java.util.Collections;
import java.util.Map;

//import org.terasology.entitySystem.Component;

/**
 * A dummy implementation of {@link WorldConfigurator} that does nothing.
 */
//MODIFIED
public class WorldConfiguratorAdapter implements WorldConfigurator {

    @Override
    public Map<String, Object> getProperties() {
        return Collections.emptyMap();
    }

    @Override
    public void setProperty(String key, Object comp) {
        // simply ignore
    }
}
