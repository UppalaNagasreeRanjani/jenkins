package com.cts.training.helloworldservice;

import org.springframework.web.bind.annotation.GetMapping;

public class RestController {
@GetMapping("/hello")
public String hello() {
	return "Hello";
}
@GetMapping("/message")
public String message() {
	return "hi";
}
}
