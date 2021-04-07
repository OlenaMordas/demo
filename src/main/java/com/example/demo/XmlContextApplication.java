package com.example.demo;

import com.example.demo.xml.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class XmlContextApplication {

	private static Logger logger = LoggerFactory.getLogger(XmlContextApplication.class);

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			XMLPersonDAO xmlPersonDAO = applicationContext.getBean(XMLPersonDAO.class);
			logger.info("{}", xmlPersonDAO, xmlPersonDAO.getXmlJdbcConnection());
		}

	}
}
