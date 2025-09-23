package com.SpringFramework.SpringAssignment.Services;

import com.SpringFramework.SpringAssignment.Interface.BeanInterface;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.RequestScope;

@Component("requestBean")
@RequestScope
//@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Service3 implements BeanInterface {

    @Override
    public int printHashCode() {
        return this.hashCode();
    }

    public Service3(){
        System.out.println("Request bean created " + this.printHashCode());
    }

    @PostConstruct
    public void init(){
        System.out.println("@PostConstruct: RequestScope Bean is now initialized");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("@PreDestroy: RequestScope Bean is now destroyed");
    }
}
