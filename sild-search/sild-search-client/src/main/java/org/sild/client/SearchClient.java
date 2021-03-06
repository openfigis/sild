package org.sild.client;

import javax.ws.rs.core.MediaType;

import org.sild.service.SearchService;
import org.sild.service.request.AdvancedSearchRequest;
import org.sild.service.response.SearchResult;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

/**
 * 
 * @author Erik van Ingen
 * 
 */
public class SearchClient implements SearchService {

	private static String SERVER = "http://localhost:8080/sild-search-web/rest/search";
	private static String ADVANCEDSERVER = "http://localhost:8080/sild-search-web/rest/advancedsearch";
	private static String SEARCH_TERM = "searchTerm";
	private static String WORDINTITLE = "wordInTitle";
	private static String AUTHORS = "authors";
	private static String PUBLICATIONYEAR = "publicationYear";
	private static String LANGUAGE = "language";
	private static String SERIESTITLE = "seriesTitle";

	@Override
	public SearchResult search(String searchTerm) {

		ClientResponse response = getWebResource(SERVER).queryParam(SEARCH_TERM, searchTerm)
				.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		evaluateResponse(response);
		return response.getEntity(SearchResult.class);

	}

	@Override
	public SearchResult search(AdvancedSearchRequest sp) {
		WebResource wr = getWebResource(ADVANCEDSERVER).queryParam(SEARCH_TERM, sp.getSearchTerm())
				.queryParam(WORDINTITLE, sp.getWordInTitle()).queryParam(AUTHORS, sp.getAuthors())
				.queryParam(PUBLICATIONYEAR, Integer.toString(sp.getPublicationYear()))
				.queryParam(LANGUAGE, sp.getLanguage()).queryParam(SERIESTITLE, sp.getSeriesTitle());
		ClientResponse response = wr.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		evaluateResponse(response);
		return response.getEntity(SearchResult.class);
	}

	private WebResource getWebResource(String server) {
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		return Client.create(clientConfig).resource(server);
	}

	private void evaluateResponse(ClientResponse response) {
		if (response.getStatus() != 200) {
			throw new ClientException("Failed : HTTP error code : " + response.getStatus());
		}
	}

}
