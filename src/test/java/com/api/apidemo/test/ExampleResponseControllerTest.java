package com.api.apidemo.test;

import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.api.apidemo.api.ExampleResponseController;
import com.api.apidemo.service.ExampleResponseService;

@WebMvcTest(ExampleResponseController.class)
@RunWith(SpringRunner.class)
public class ExampleResponseControllerTest {

	@Autowired 
	private MockMvc mockMvc;
	
	@MockBean
    private ExampleResponseService responseService;
	
	final String BASE_PATH = "/example";
	
	@Test
    public void testGetResponseMock() throws Exception {
    	given(responseService.getResponse((anyString()))).willReturn(anyString());

        mockMvc.perform(get(BASE_PATH+"/api")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
	
	@Test
    public void testPutResponse() throws Exception {
    	given(responseService.putResponse((anyString()))).willReturn(anyBoolean());

        mockMvc.perform(put(BASE_PATH+"/number/5")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
	
}
