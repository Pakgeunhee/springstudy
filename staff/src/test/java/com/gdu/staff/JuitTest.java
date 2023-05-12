package com.gdu.staff;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@WebAppConfiguration
public class JuitTest {
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(JuitTest.class);
	
	@Before
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	@Test
	public void assertEquals() throws Exception {
		LOGGER.debug(mockMvc.perform(MockMvcRequestBuilders
				.post("/staff/add.do")
					.param("sno", "99999")
					.param("name", "김기획")
					.param("dept", "기획부")
					.param("salary", "5000"))
						.andReturn()
						.getFlashMap()
							.toString());
	}
	
	public void assertNotNull() throws Exception {
		LOGGER.debug(mockMvc.perform(MockMvcRequestBuilders
				.get("/staff/query.json")
					.param("sno", "11111"))
						.andReturn()
						.getModelAndView()
						.getModelMap()
							.toString());
	}
}
