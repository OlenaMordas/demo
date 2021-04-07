package com.example.demo;

import com.example.demo.cdi.CDIExampleBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.demo.cdi")
public class CDIApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(CDIApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(CDIApplication.class, args);
		CDIExampleBusiness cdiExampleBusiness = applicationContext.getBean(CDIExampleBusiness.class);

		LOGGER.info("{}", cdiExampleBusiness, cdiExampleBusiness.getCdiExampleDAO());

	}

}
