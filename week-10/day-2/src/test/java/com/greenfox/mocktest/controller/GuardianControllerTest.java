package com.greenfox.mocktest.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void testGroot_caseOne() throws Exception {
    mockMvc.perform(get("/groot"))
        .andExpect(status().isBadRequest());
  }

  @Test
  public void testGroot_caseTwo() throws Exception {
    mockMvc.perform(get("/groot"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error", is("I am Groot!")));
  }

  @Test
  public void testGroot_caseThree() throws Exception {
    mockMvc.perform(get("/groot?message=Cucli"))
        .andExpect(status().isOk());
  }

  @Test
  public void testGroot_caseFour() throws Exception {
    mockMvc.perform(get("/groot?message=Cucli"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.received", is("Cucli")))
        .andExpect(jsonPath("$.translated", is("I am Groot!")));
  }

  @Test
  public void arrowOfYondu_caseOne() throws Exception {
    mockMvc.perform(get("/yondu"))
        .andExpect(status().isBadRequest());
  }

  @Test
  public void arrowOfYondu_caseTwo() throws Exception {
    mockMvc.perform(get("/yondu"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error", is("Please make sure you provided" +
            " both a distance and time value!")));
  }

  @Test
  public void arrowOfYondu_caseThree() throws Exception {
    mockMvc.perform(get("/yondu?distance=100.0&time=10.0"))
        .andExpect(status().isOk());
  }

  @Test
  public void arrowOfYondu_caseFour() throws Exception {
    mockMvc.perform(get("/yondu?distance=100.0&time=10.0"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.speed", is(10.0)));
  }
}
