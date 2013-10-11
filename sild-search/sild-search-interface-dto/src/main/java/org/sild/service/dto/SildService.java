/**
 * 
 */
package org.sild.service.dto;

import org.sild.service.dto.FetchURIresponse;

/**
 * @author Erik van Ingen
 * 
 */
public interface SildService {

	public FetchURIresponse fetchURI(String codeList, String code);

}
