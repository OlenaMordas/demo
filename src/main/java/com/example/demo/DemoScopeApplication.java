package com.example.demo;

import com.example.demo.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DemoScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(DemoScopeApplication.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoScopeApplication.class)) {
			PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
			PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

			LOGGER.info("{}", personDAO);
			LOGGER.info("{}", personDAO2);
			LOGGER.info("{}", personDAO.getJdbcConnection());
			LOGGER.info("{}", personDAO2.getJdbcConnection());

		}
	}

}
