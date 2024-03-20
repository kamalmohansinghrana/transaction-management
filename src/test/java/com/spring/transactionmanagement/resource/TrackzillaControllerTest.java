package com.spring.transactionmanagement.resource;

import com.spring.transactionmanagement.service.ApplicationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class TrackzillaControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    ApplicationService applicationService;

    @Test
    void getAllTickets() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/tza/tickets")
                .contentType(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        MockHttpServletResponse response = result.getResponse();
        assertEquals(HttpStatus.OK, response.getStatus());
    }

    @Test
    void getAllApplication() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/tza/applications")
                .contentType(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        MockHttpServletResponse  response  = result.getResponse();
        assertEquals(HttpStatus.OK,response.getStatus());
    }
}