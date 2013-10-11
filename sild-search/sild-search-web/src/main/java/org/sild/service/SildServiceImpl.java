package org.sild.service;

import java.net.URL;
import java.util.Map;

import org.sild.service.dto.FetchURIresponse;
import org.sild.service.dto.SildService;

/**
 * @author Erik van Ingen
 * 
 */

public class SildServiceImpl implements SildService {

	private static Map<String, URL> map;

	static {
		CsvFileParser csvFile = new CsvFileParser();
		map = csvFile.read();
	}

	@Override
	public FetchURIresponse fetchURI(String codeList, String code) {
		// precondition
		if (!codeList.equals("asfis")) {
			throw new SildException("Yet only asfis is supported");
		}
		if (!map.containsKey(code)) {
			throw new SildException("No url found for this asfis code");
		}

		// logic
		FetchURIresponse r = new FetchURIresponse();
		r.setURI(map.get(code.toUpperCase()));

		// postcondition

		return r;
	}
}
