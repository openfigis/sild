package org.sild.web.service;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sild.service.SearchService;
import org.sild.service.request.AdvancedSearchRequest;
import org.sild.service.response.SearchResult;

/**
 * 
 * @author Erik van Ingen
 * 
 */
@Path("")
@Singleton
public class SildWs {

	@Inject
	private SearchService service;

	@GET
	@Path("/search")
	@Produces(MediaType.APPLICATION_JSON)
	public SearchResult search(@PathParam("searchTerm") String searchTerm) {
		return service.search(searchTerm);
	}

	@POST
	@Path("/search")
	@Produces(MediaType.APPLICATION_JSON)
	public SearchResult advancedSearch(AdvancedSearchRequest advancedSearchRequest) {
		return service.search(advancedSearchRequest);
	}

}