package com.example.demo;

import com.example.demo.properies.SomeExternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class DemoPropertiesApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(DemoScopeApplication.class);

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoScopeApplication.class);
		SomeExternalService service = applicationContext.getBean(SomeExternalService.class);

		LOGGER.info("{}", service.getServiceUrl());
		applicationContext.close();
	}
}
