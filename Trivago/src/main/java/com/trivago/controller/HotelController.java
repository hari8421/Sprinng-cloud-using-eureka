package com.trivago.controller;

import java.nio.charset.Charset;

import org.apache.tomcat.util.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class HotelController {
	
	
	private static final Logger logger = LoggerFactory.getLogger(HotelController.class);
	
	@GetMapping("/getRoomList")
	public <T> ResponseEntity<String> getRoomList() {
		logger.info("Contacting Hotel");
		RestTemplate rTemp=new RestTemplate();
		ResponseEntity<String> roomList=rTemp.exchange
				 ("http://localhost:8079/hotel-app/hotel/getAllReservations", HttpMethod.GET, new HttpEntity<T>(createHeaders("admin", "admin")), String.class);

			
		return roomList;
	}
	HttpHeaders createHeaders(String username, String password){
		   return new HttpHeaders() {
			private static final long serialVersionUID = 1L;

		{
		         String auth = username + ":" + password;
		         byte[] encodedAuth = Base64.encodeBase64( 
		            auth.getBytes(Charset.forName("US-ASCII")) );
		         String authHeader = "Basic " + new String( encodedAuth );
		         set( "Authorization", authHeader );
		      }};
		}
}
