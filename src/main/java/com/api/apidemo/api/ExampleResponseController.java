package com.api.apidemo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.apidemo.service.ExampleResponseService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/example")
public class ExampleResponseController {
	
	@Autowired
	private ExampleResponseService responseService;
	
	@GetMapping("/{pathVar}")
	public String getResponseApi(@PathVariable String pathVar){
		log.info("call service");
		return responseService.getResponse(pathVar);
	}
	
	@PutMapping("/number/{pathVar}")
	public boolean putResponseApi(@PathVariable String pathVar){
		log.info("call service");
		return responseService.putResponse(pathVar);
	}
	
}
