package org.sild.service.test;

import static org.junit.Assert.assertTrue;

import javax.inject.Inject;

import org.junit.Test;
import org.sild.service.SearchService;
import org.sild.service.response.SearchResult;

public abstract class SildAbstractServiceTest {

	@Inject
	protected SearchService searchService;

	@Test
	public void testFetchLodUrl() {
		String searchTerm = "asfis";
		SearchResult response = searchService.search(searchTerm);
		assertTrue(response.getFoundElementList().size() > 0);
	}
}
