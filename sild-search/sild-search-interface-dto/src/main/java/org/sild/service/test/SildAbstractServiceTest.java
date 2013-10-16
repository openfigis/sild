package org.sild.service.test;

import static org.junit.Assert.assertTrue;

import javax.inject.Inject;

import org.junit.Test;
import org.sild.service.SearchService;
import org.sild.service.request.AdvancedSearchRequest;
import org.sild.service.response.SearchResult;

public abstract class SildAbstractServiceTest {
	String searchTerm = "asfis";
	@Inject
	protected SearchService searchService;

	@Test
	public void testSearch() {

		SearchResult response = searchService.search(searchTerm);
		assertTrue(response.getFoundElementList().size() > 0);
	}

	@Test
	public void testadvancedSearch() {
		AdvancedSearchRequest r = new AdvancedSearchRequest();
		r.setSearchTerm(searchTerm);
		SearchResult response = searchService.search(r);
		assertTrue(response.getFoundElementList().size() > 0);
	}

}
