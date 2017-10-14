package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.UserRepository;
import com.example.demo.vo.User;


@RestController
public class TableController {
	@Autowired
	UserRepository repository;

	@RequestMapping(name = "getAllUser", method = RequestMethod.GET,produces= MediaType.APPLICATION_JSON_VALUE)
	public User[] getAllUser() {
		HttpHeaders responseHeaders = new HttpHeaders();
		List<User> list= repository.findAll();
		User[] userList = list.toArray(new User[list.size()]);
//		return new ResponseEntity<List<User>>(userList, responseHeaders, HttpStatus.CREATED);
		return userList;
	}
}
