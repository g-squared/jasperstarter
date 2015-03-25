/*
 * Copyright 2013 Cenote GmbH.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.cenote.jasperstarter;

import java.io.IOException;
import static org.testng.Assert.*;

/**
 *
 * @author Volker Voßkämper <vvo at cenote.de>
 */
public class ConfigNGTest {

    public ConfigNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of constructor, of class Config.
     */
    @org.testng.annotations.Test
    public void testConfig() {
        System.out.println("Config()");
        Config instance = new Config();
        // @todo: Config() cannot get JasperReports version while testing
        assertNotNull(instance);
    }

    /**
     * Test of getVersionString method, of class Config.
     */
    @org.testng.annotations.Test(dependsOnMethods = {"testConfig"})
    public void testGetVersionString() {
        System.out.println("getVersionString");
        Config instance = new Config();
        String result = instance.getVersionString();
        assertNotNull(result);

    }
}
