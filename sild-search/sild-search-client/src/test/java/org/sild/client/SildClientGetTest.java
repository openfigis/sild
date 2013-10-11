package org.sild.client;

import org.sild.client.SildClientGet;
import org.sild.service.test.SildAbstractServiceTest;
import org.jglue.cdiunit.AdditionalClasses;
import org.jglue.cdiunit.CdiRunner;
import org.junit.runner.RunWith;

@RunWith(CdiRunner.class)
@AdditionalClasses(SildClientGet.class)
public class SildClientGetTest extends SildAbstractServiceTest {

}
