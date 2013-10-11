package org.sild.service.test;

import javax.inject.Inject;
import org.sild.service.dto.FetchURIresponse;
import org.sild.service.dto.SildService;
import org.junit.Test;
import static org.junit.Assert.*;


public abstract class SildAbstractServiceTest {

	private String URI = "http://www.fao.org/figis/sild/entities/codedentity/3ff3592a-a24e-4da9-9ba7-983c09355018";

	@Inject
	protected SildService sildService;

	@Test
	public void testFetchLodUrl() {
		String codeList = "asfis";
		String code = "TUN";
		FetchURIresponse response = sildService.fetchURI(codeList, code);
		assertEquals(URI, response.getURI().toString());
	}
}
