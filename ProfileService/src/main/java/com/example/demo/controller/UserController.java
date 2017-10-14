package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.vo.User;

@RestController("user")
public class UserController {

	@Autowired
	RestTemplate restTemplate;
	@RequestMapping(name = "getAllUser", method = RequestMethod.GET,produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User[]> getAllUser() {
//		return new ResponseEntity<String>("Hello World", responseHeaders, HttpStatus.CREATED);
		return restTemplate.getForEntity("http://databaseservice/db/getAllUser", User[].class);
	}
}
