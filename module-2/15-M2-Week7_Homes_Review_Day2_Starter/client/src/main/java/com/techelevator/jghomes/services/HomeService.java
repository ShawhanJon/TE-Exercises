package com.techelevator.jghomes.services;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import com.techelevator.jghomes.models.Home;

public class HomeService {
	
	private final String BASE_SERVICE_URL;
	public String AUTH_TOKEN = "";
	private RestTemplate restTemplate = new RestTemplate();
	
	public HomeService(String baseUrl) {
		this.BASE_SERVICE_URL = baseUrl;
	}	
	
	public Home[] retrieveListOfHomes() {
		
	    Home[] homes = null;
	    
	    try {
	      homes = restTemplate.exchange(BASE_SERVICE_URL + "/homes", HttpMethod.GET, makeAuthEntity(), Home[].class).getBody();
	    } catch (RestClientResponseException ex) {
	    	ex.printStackTrace();
	    }
	    return homes;
	  }
	    
		
	    //create HTTP header so we can set application/json AND AUTH_TOKEN

	    
	    //build and entity object so the header gets added
		
		
	    //call the web service using the exchange method 
	
	
	
	public Home retrieveHomesByMLSID(String mlsId) {
		
		Home home = null;
	    
	    try {
	      home = restTemplate.exchange(BASE_SERVICE_URL + "/homes/" + mlsId, HttpMethod.GET, makeAuthEntity(), Home.class).getBody();
	    } catch (RestClientResponseException ex) {
	    	ex.printStackTrace();
	    }
	    return home;
	  }
		
	    //create HTTP header so we can set application/json AND AUTH_TOKEN
	    
	    //build and entity object so the header gets added
	  	
		
	    //call the web service using the exchange method 


	
	public void addHome(Home home) {
		
		
		ResponseEntity<String> response;
		try {
			response = restTemplate.exchange(BASE_SERVICE_URL + "/homes/", HttpMethod.POST, makeHomeEntity(home), String.class);
	    } catch (RestClientResponseException ex) {
	    	ex.printStackTrace();
	    }
	}
		
	    //create HTTP header so we can set application/json AND AUTH_TOKEN
	    
	    //build and entity object so the header gets added

	    //call the web service using the exchange method 
		
		
	
	public void deleteHome(String mlsId) {
		
		ResponseEntity<String> response;
		try {
			response = restTemplate.exchange(BASE_SERVICE_URL + "/homes/" + mlsId, HttpMethod.DELETE, makeAuthEntity(), String.class);
	    } catch (RestClientResponseException ex) {
	    	ex.printStackTrace();
	    }
	}
		
	  
	    //create HTTP header so we can set application/json AND AUTH_TOKEN

	 
	    //build and entity object so the header gets added
			
		
	    //call the web service on the server-side to retrieve an array of students...


		
	
	
	
	/**
	 * This gets set by the client once authentication occurs
	 * @param aUTH_TOKEN
	 */
	public void setAUTH_TOKEN(String aUTH_TOKEN) {
		AUTH_TOKEN = aUTH_TOKEN;
	}	
	
	private HttpEntity makeAuthEntity() {
	    HttpHeaders headers = new HttpHeaders();
	    headers.setBearerAuth(AUTH_TOKEN);
	    HttpEntity entity = new HttpEntity<>(headers);
	    return entity;
	  }
	private HttpEntity<Home> makeHomeEntity(Home home) {
	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);
	    headers.setBearerAuth(AUTH_TOKEN);
	    HttpEntity<Home> entity = new HttpEntity<>(home, headers);
	    return entity;
	  }

}
	
