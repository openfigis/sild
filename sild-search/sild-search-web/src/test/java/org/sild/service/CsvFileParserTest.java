package org.sild.service;

import static org.junit.Assert.assertEquals;

import java.net.URL;
import java.util.Map;

import org.junit.Test;
import org.sild.service.CsvFileParser;

public class CsvFileParserTest {

	@Test
	public void testRead() {
		CsvFileParser csvFile = new CsvFileParser();
		Map<String, URL> map = csvFile.read();
		assertEquals(10915, map.size());
	}

}
