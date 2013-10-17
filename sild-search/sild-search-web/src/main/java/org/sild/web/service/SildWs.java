package org.sild.web.service;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
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
@Path("")
@Singleton
public class SildWs {

	@Inject
	private SearchService service;

	@GET
	@Path("search")
	@Produces(MediaType.APPLICATION_JSON)
	public SearchResult search(@QueryParam("searchTerm") String searchTerm) {
		System.out.println("hitting SildWs search searchTerm!!! with searchTerm:" + searchTerm);

		return service.search(searchTerm);
	}

	@GET
	@Path("advancedsearch")
	@Produces(MediaType.APPLICATION_JSON)
	public SearchResult advancedSearch(@QueryParam("searchTerm") String searchTerm,
			@QueryParam("wordInTitle") String wordInTitle, @QueryParam("authors") String authors,
			@QueryParam("publicationYear") int publicationYear, @QueryParam("language") String language,
			@QueryParam("seriesTitle") String seriesTitle

	) {
		System.out.println("hitting SildWs search advancedSearchRequest!!! with searchTerm:" + searchTerm);

		AdvancedSearchRequest r = new AdvancedSearchRequest();
		r.setAuthors(authors);
		r.setLanguage(language);
		r.setPublicationYear(publicationYear);
		r.setSearchTerm(searchTerm);
		r.setSeriesTitle(seriesTitle);
		r.setWordInTitle(wordInTitle);
		return service.search(r);
	}

}