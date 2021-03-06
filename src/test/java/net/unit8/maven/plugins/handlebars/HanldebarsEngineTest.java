/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package net.unit8.maven.plugins.handlebars;


import org.apache.maven.plugin.MojoExecutionException;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.io.File;

public class HanldebarsEngineTest {


    @Test
    public void fetchHandlebars() throws MojoExecutionException {
        HandlebarsEngine engine = new HandlebarsEngine("1.0.rc.2");
        engine.setCacheDir(new File("target"));
        engine.fetchHandlebars("1.0.rc.2");

       assertTrue(new File("target/1.0.rc.2").exists());
    }
}
