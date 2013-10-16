/**
 * 
 */
package org.sild.service;

import org.sild.service.request.AdvancedSearchRequest;
import org.sild.service.response.SearchResult;

/**
 * @author Erik van Ingen
 * 
 */
public interface SearchService {

	public SearchResult search(String searchTerm);

	public SearchResult search(AdvancedSearchRequest searchParameters);

}
