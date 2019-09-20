/**
 *
 */
package org.fcrepo.migration.f4clients;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;


/**
 * @author Remigiusz Malessa
 * @since 4.4.1-SNAPSHOT
 */
public class OCFLFedora4ClientTest {

    private static OCFLFedora4Client client;

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUp() throws Exception {

        final String storage = "src/test/resources/ocflStorage";
        final String staging = "src/test/resources/staging";
        client = new OCFLFedora4Client(storage, staging);
    }


    /**
     * @author copied implementation from OCFLGoLangFedora4ClientIT by @awoods
     * @since 4.4.1-SNAPSHOT
     */
    @Test
    public void testExists() {

        final String badId = "o2";
        assertFalse("Object should not exist: " + badId, client.exists(badId));

        final String goodId = "o1";
        assertTrue("Object should exist: " + goodId, client.exists(goodId));
    }

}
