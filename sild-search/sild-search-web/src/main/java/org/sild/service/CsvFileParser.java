package org.sild.service;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import au.com.bytecode.opencsv.CSVReader;

public class CsvFileParser {

	public Map<String, URL> read() {
		InputStream stream = CsvFileParser.class.getResourceAsStream("/sild_entities_asfis.csv");

		// CSVReader(Reader reader,
		// char separator,
		// char quotechar,
		// int line)

		CSVReader csvReader = new CSVReader(new InputStreamReader(stream), ',', ' ', 1);
		List<String[]> myEntries;
		Map<String, URL> map = new HashMap<String, URL>();
		try {
			myEntries = csvReader.readAll();
			csvReader.close();
			for (String[] row : myEntries) {
				URL url = new URL(row[1]);
				map.put(row[0], url);
			}
		} catch (IOException e) {
			throw new SildException(e);
		}
		System.out.println("CSV file sild_entities_asfis.csv loaded in memory");
		return map;
	}
}
