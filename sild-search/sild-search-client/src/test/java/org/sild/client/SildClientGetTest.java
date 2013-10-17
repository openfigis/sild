package org.sild.client;

import org.jglue.cdiunit.AdditionalClasses;
import org.jglue.cdiunit.CdiRunner;
import org.junit.runner.RunWith;
import org.sild.service.test.SildAbstractServiceTest;

/**
 * As configured now, this is an integration test.
 * 
 * 
 * @author Erik van Ingen
 * 
 */
@RunWith(CdiRunner.class)
@AdditionalClasses(SearchClient.class)
public class SildClientGetTest extends SildAbstractServiceTest {

}
