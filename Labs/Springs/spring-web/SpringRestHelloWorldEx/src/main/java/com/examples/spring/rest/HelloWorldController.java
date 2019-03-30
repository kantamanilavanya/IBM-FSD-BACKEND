package com.examples.spring.rest;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value="/",method=RequestMethod.GET,produces=MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public String sayHello() {
		System.out.println("Hello World");
		return "Hello World for Spring Rest";
		
	}
	
	@RequestMapping(value="/greeting",method=RequestMethod.GET,produces="text/html")
	@ResponseBody
	public String greeting() {
		System.out.println("Hello World");
		return "<html><head><title>Hello</title></head><body><h1>Greeting lavanya</h1></body></html>";
		
	}
	
	@RequestMapping(value="/welcome",method=RequestMethod.GET,produces="application/json")
	@ResponseBody
	public String welcome() {
		System.out.println("Hello World");
		//return "<html><head><title>Hello</title></head><body><h1>Greeting lavanya</h1></body></html>";
		return "{\"message\":\"Welcome Lavanya\"}";
	}
	
	@RequestMapping(value="/data",method=RequestMethod.GET,params= {"msg"})
	@ResponseBody
	public String welcome(String msg) {
		System.out.println("Hello World");
		//return "<html><head><title>Hello</title></head><body><h1>Greeting lavanya</h1></body></html>";
		return "Hello "+msg;
	}
	/*@RequestMapping(value="/data",method=RequestMethod.GET)
	@ResponseBody
	public String welcome(@RequestParam(required=false) String msg) {
		System.out.println("Hello World");
		//return "<html><head><title>Hello</title></head><body><h1>Greeting lavanya</h1></body></html>";
		return "Hello "+msg;
	}*/
	
	@PostMapping(value="/greeting")
	@ResponseBody
	public String greetings(@RequestBody String reqBody) {
		return "Welcome Lavanya"+reqBody;
	}
	
	@RequestMapping(value="/greeting",method=RequestMethod.DELETE)
	@ResponseBody
	public String greetingsDelete(@RequestBody String msg) {
		return "Welcome Lavanya: "+msg;
	}
	
	@PutMapping(value="/put")
	@ResponseBody
	public String greetingPut(@RequestBody String msg) {
		return "Hello put"+msg;
		
	}
	
	

}
