package com.example.demo.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.vo.User;

@RestController
public class ProfileServiceController {
	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/sayNamesWithId")
	private ResponseEntity<String> sayNamesWithId() {
		HttpHeaders responseHeaders = new HttpHeaders();
		try {
			URI location = new URI("");
			responseHeaders.setLocation(location);
			responseHeaders.set("MyResponseHeader", "MyValue");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return new ResponseEntity<String>("Hello World", responseHeaders, HttpStatus.CREATED);
	}
	
	@RequestMapping(name = "getAllUser", method = RequestMethod.GET,produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User[]> getAllUser() {
//		return new ResponseEntity<String>("Hello World", responseHeaders, HttpStatus.CREATED);
		return restTemplate.getForEntity("http://profileservices/profile/user/getAllUser", User[].class);
	}

}
