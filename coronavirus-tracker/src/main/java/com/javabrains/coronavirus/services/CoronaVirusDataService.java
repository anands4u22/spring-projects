package com.javabrains.coronavirus.services;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import com.javabrains.coronavirus.entity.*;

@Service
public class CoronaVirusDataService {
	
	private static String VIRUS_DATA_URL="https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv";
	
	@Autowired
	private RestTemplate restTemplate;
	
	private List<LocationStats> allStats=new ArrayList<LocationStats>();
	
	public List<LocationStats> getAllStats() {
		return allStats;
	}

	@PostConstruct
	@Scheduled(cron="* * 1 * * *")
	public void fetchVirusData()
	{
		List<LocationStats> newStats=new ArrayList<LocationStats>();
		
		String response=restTemplate.getForObject(VIRUS_DATA_URL,String.class);
		StringReader csvBodyReder=new StringReader(response);
		Iterable<CSVRecord> records=null;
		try {
			records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(csvBodyReder);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (CSVRecord record : records) {
			LocationStats locationStat=new LocationStats();
			if(!record.get("Province/State").isEmpty()) {
			locationStat.setState(record.get("Province/State"));
		    locationStat.setCountry(record.get("Country/Region"));
		    int latestCases=Integer.parseInt(record.get(record.size()-1));
		    int prevCases=Integer.parseInt(record.get(record.size()-2));
		    locationStat.setLatestTotalCases(latestCases);
		    locationStat.setDiffFromPrevDay(latestCases-prevCases);
			}
		    
		    newStats.add(locationStat);
		}
		
		this.allStats=newStats;
		
	}

	
	
}
