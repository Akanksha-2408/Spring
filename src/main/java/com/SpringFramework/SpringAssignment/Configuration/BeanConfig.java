package com.SpringFramework.SpringAssignment.Configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


// 2nd way to load and use bean.properies instead of application.properties

@Configuration
@PropertySource("classpath:bean.properties")
public class BeanConfig {
    @Value("${app.title}")
    String title;

    @Bean
    public SomeBean someBean() {
        return new SomeBean(title);
    }
}
