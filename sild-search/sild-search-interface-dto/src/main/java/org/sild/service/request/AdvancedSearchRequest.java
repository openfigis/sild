package org.sild.service.request;

/**
 * 
 * @author Erik van Ingen
 * 
 */
public class AdvancedSearchRequest {

	private String searchTerm;
	private String wordInTitle;
	private String authors;
	private int publicationYear;
	private String language;
	private String seriesTitle;

	public String getSearchTerm() {
		return searchTerm;
	}

	public void setSearchTerm(String searchTerm) {
		this.searchTerm = searchTerm;
	}

	public String getWordInTitle() {
		return wordInTitle;
	}

	public void setWordInTitle(String wordInTitle) {
		this.wordInTitle = wordInTitle;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getSeriesTitle() {
		return seriesTitle;
	}

	public void setSeriesTitle(String seriesTitle) {
		this.seriesTitle = seriesTitle;
	}

}
