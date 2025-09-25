package com.SpringFramework.SpringAssignment.Configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@RefreshScope
@Service
public class BeanConfig {
    @Value("${app.title}")
    private String title;

    public String getTitle() {
        return title;
    }
}