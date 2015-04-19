package com.sergiolealdev.demoSpringResource.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.sergiolealdev.demoSpringResource.SpringResourceHandlingApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringResourceHandlingApplication.class)
@WebAppConfiguration
public class SpringResourceHandlingApplicationTests {

	@Test
	public void contextLoads() {
	}

}
