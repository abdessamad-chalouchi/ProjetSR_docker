//package com.app.controllers;
//
//import com.app.entities.Client;
//import com.app.entities.Role;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//public class AuthenticationControllerTest {
//    @Autowired
//    private MockMvc mockMvc;
//    @Autowired
//    private ObjectMapper objectMapper;
//    @Test
//    public void testRegister_validUser() throws Exception {
//        var user = new Client(
//                0,
//                92000,
//                "test rue",
//                "larache",
//                "test1@example.com",
//                "test",
//                "abdo",
//                "test",
//                Role.CLIENT
//        );
////        System.out.println(objectMapper.writeValueAsString(user));
//        mockMvc.perform(
//                        MockMvcRequestBuilders.post("/api/v1/auth/register/true")
//                                .contentType(MediaType.APPLICATION_JSON)
//                                .content(objectMapper.writeValueAsString(user))
//                )
////                .andDo(result1 -> {
////                    System.out.println("Response: " + result1.getResponse().getContentAsString());
////                })
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.token").exists());
//    }
//
//}
