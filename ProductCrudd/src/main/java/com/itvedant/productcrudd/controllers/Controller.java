package com.itvedant.productcrudd.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
@GetMapping("/hello") // url "/hello", request type: Get

public String sayHello() {
	return "Hello Developer";
}

@GetMapping("/hie")
public String sayHi() {
	return "Hi Developer";
}

@GetMapping("")
public String Home() {
	return "Welcome to productcrud";
}


}