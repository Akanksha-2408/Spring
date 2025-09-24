package com.SpringFramework.SpringAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;


@SpringBootApplication
public class SpringAssignmentApplication {
	public static void main(String[] args) throws IOException {

         SpringApplication.run(SpringAssignmentApplication.class, args);

        // Loads and uses Bean.properties rather than application.properties
        // This is one way
//        SpringApplication app = new SpringApplication(SpringAssignmentApplication.class);
//
//        Properties prop = new Properties();
//        prop.load(new ClassPathResource("bean.properties").getInputStream());
//
//        app.setDefaultProperties(prop);
//        app.run(args);
	}
}