package org.sild.service;

import org.sild.service.impl.SildServiceImpl;
import org.sild.service.test.SildAbstractServiceTest;
import org.jglue.cdiunit.AdditionalClasses;
import org.jglue.cdiunit.CdiRunner;
import org.junit.runner.RunWith;

@RunWith(CdiRunner.class)
@AdditionalClasses(SildServiceImpl.class)
public class SildServiceImplTest extends SildAbstractServiceTest {


}
