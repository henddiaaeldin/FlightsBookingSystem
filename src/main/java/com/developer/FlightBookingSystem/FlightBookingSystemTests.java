/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.developer.FlightBookingSystem;

/**
 *
 * @author HP
 */
import com.developer.FlightBookingSystem.Entity.Controller.AdminController;
import com.developer.FlightBookingSystem.Entity.Controller.UserController;
import static javax.swing.UIManager.get;
import static org.hamcrest.CoreMatchers.containsString;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class FlightBookingSystemTests {
     @Test
    void contextLoads() {
    }
   
    @Autowired
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

    @Autowired
    private UserController userController;


    @Autowired
    private AdminController adminController;

    
    /**
     * Should return status ok for correct flight number.
     *
     * @throws Exception the exception
     */
// FLIGHT CRUD APIs
    @Test
    public void shouldReturnStatusOKForCorrectFlightId() throws Exception {
       this.mockMvc.perform((RequestBuilder) get("/flight/111")).andDo(print())
                .andExpect(status().isOk());
    }

    /**
     * Should return status 404 not found for in correct flight number.
     *
     * @throws Exception the exception
     */
    @Test
    public void shouldReturnStatus404NotFoundForInCorrectFlightNumber() throws Exception {
        this.mockMvc.perform((RequestBuilder) get("/flight/0")).andDo(print())
                .andExpect(status().is4xxClientError());
    }

    /**
     * Should return status ok with expected from for flight creation.
     *
     * @throws Exception the exception
     */
    @Test
    public void shouldReturnStatusOKWithExpectedFromForFlightCreation() throws Exception {
        this.mockMvc.perform(post("/flight/1111?fare=3330&from=CA&to=BLR&departureTime=2033-12-25-09" +
                "&arrivalTime=2033-12-25-14"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("CA")));
    }

    /**
     * Should return status ok for flight updation.
     *
     * @throws Exception the exception
     */
    @Test
    public void shouldReturnStatusOKForFlightUpdation() throws Exception {
        this.mockMvc.perform(post("/flight/JJ11?price=3530&from=CA&to=BLR&departureTime=2033-12-25-09" +
                "&arrivalTime=2033-12-25-16"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    private Object assertThat(UserController passengerController) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private RequestBuilder post(String passengerfirstnameJimmylastnameBeanage21g) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private RequestBuilder put(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

