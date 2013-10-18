package org.sild.service.impl;

import org.sild.service.SearchService;
import org.sild.service.request.AdvancedSearchRequest;
import org.sild.service.response.SearchResult;
import org.sild.service.test.SearchResultMock;
import org.sild.service.test.SildAbstractServiceTest;

/**
 * @author Erik van Ingen
 * 
 */

public class SildServiceImpl implements SearchService {

	@Override
	public SearchResult search(String searchTerm) {
		return SearchResultMock.get();

	}

	@Override
	public SearchResult search(AdvancedSearchRequest searchParameters) {
		return SearchResultMock.get(SildAbstractServiceTest.ENTRIES_FOUND);
	}

}
