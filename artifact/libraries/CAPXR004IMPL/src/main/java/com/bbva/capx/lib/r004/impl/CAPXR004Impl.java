package com.bbva.capx.lib.r004.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import com.bbva.capx.dto.proy1.DataOut;
import com.bbva.capx.lib.r004.CAPXR004;

public class CAPXR004Impl extends CAPXR004Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(CAPXR004.class);

	@Override
	public DataOut execute(String origin, String destination )  throws IOException{

		LOGGER.info("Starting execute");
		DataOut result = new DataOut();
	
		

        RestTemplate restTemplate = new RestTemplate();
        String json = restTemplate.getForObject("https://maps.googleapis.com/maps/api/directions/json?origin=" + origin + "&destination=" + destination + "&key=AIzaSyByPeqwGB3sb1BXGhEkzfzmnOodqugTM6Q", String.class);
    
        
    	BufferedReader reader = new BufferedReader(new StringReader(json));    	
        
        String aux;
        String[] parts; 		
    	int result2;

        for (int i = 1; i<100; i++ ) {
        	
        	aux = reader.readLine();
        	if (aux.contains("distance") ) {
        		
            	aux = reader.readLine();
            	parts = aux.split("\"");
            	LOGGER.info("Distance {}",   parts[3]);
            	result.setDistance(parts[3]);
        	}
        	if (aux.contains("duration") ) {
        		
            	aux = reader.readLine();
            	parts = aux.split("\"");
             	LOGGER.info("Duration {}", parts[3]);
             	result.setDuration(parts[3]);
             	
            	aux = reader.readLine();
            	parts = aux.split(":");
            	parts = parts[1].split(" ");
            	LOGGER.info("Duration seconds {}",  parts[1]);
            	
            	
            	result2 = (Integer.parseInt(parts[1])/60)*400 ;
            	LOGGER.info("Cost {} ", result2);
            	result.setPrice(result2);
            	
            	i = 100;
        	}        	
        	
        }        
        
        
        return result;
        
    }

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}
	
}
