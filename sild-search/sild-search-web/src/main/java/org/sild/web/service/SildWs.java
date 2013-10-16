package org.sild.web.service;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.sild.service.SearchService;
import org.sild.service.request.AdvancedSearchRequest;
import org.sild.service.response.SearchResult;

/**
 * 
 * @author Erik van Ingen
 * 
 */
@Path("search")
@Singleton
public class SildWs {

	@Inject
	private SearchService service;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public SearchResult search(@QueryParam("searchTerm") String searchTerm) {
		return service.search(searchTerm);
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public SearchResult advancedSearch(AdvancedSearchRequest advancedSearchRequest) {
		return service.search(advancedSearchRequest);
	}

}