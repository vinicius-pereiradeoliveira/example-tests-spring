package com.api.apidemo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.api.apidemo.service.ExampleResponseService;

@RunWith(SpringRunner.class)
@WebMvcTest(ExampleResponseService.class)
public class ExampleResponseServiceTest {
	
	@Autowired
	private ExampleResponseService responseService;
	
	@Test
	public void getResponseTest() {
		String response = responseService.getResponse("api");
		Assert.assertEquals("response success",response);
	}
	
	@Test
	public void getResponseTestFail() {
		String response = responseService.getResponse("abcd");
		Assert.assertEquals("response fail",response);
	}
	
	@Test
	public void putResponseTest() {
		Assert.assertTrue(responseService.putResponse("5"));
	}
	
	@Test
	public void putResponseTestFail() {
		Assert.assertFalse(responseService.putResponse("abc"));
	}
	
}
