package com.api.apidemo.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ExampleResponseService {

	public String getResponse(String param) {
		if(param.equals("api"))
			return "response success";
		return "response fail";
	}
	
	public boolean putResponse(String param) {
		if(StringUtils.isNumeric(param)) {
			log.info("simulate update!");
			return true;
		}
		return false;	
	}
	
}
