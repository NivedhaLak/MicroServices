//package com.example.demo.controller;
//
//import java.net.URI;
//
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class TestController {
//
//	public TestController() {
//		System.out.println("in controller");
//	}
//
//	@RequestMapping("/sayNamesWithId")
//	private ResponseEntity<String> sayNamesWithId() {
//		HttpHeaders responseHeaders = new HttpHeaders();
//		try {
//			URI location = new URI("");
//			responseHeaders.setLocation(location);
//			responseHeaders.set("MyResponseHeader", "MyValue");
//		} catch (Exception ex) {
//			System.out.println(ex.getMessage());
//		}
//		return new ResponseEntity<String>("Hello World", responseHeaders, HttpStatus.CREATED);
//	}
//}