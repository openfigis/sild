/**
 * 
 */
package org.sild.service.response;

import java.util.List;

/**
 * @author Erik van Ingen
 * 
 */
public class SearchResult {

	private List<FoundElement> foundElementList;

	public List<FoundElement> getFoundElementList() {
		return foundElementList;
	}

	public void setFoundElementList(List<FoundElement> foundElementList) {
		this.foundElementList = foundElementList;
	}

}
