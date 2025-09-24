package com.SpringFramework.SpringAssignment.Services;

import com.SpringFramework.SpringAssignment.Interface.BeanInterface;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

//@RefreshScope
@Component("singletonBean")
public class Service1 implements BeanInterface {

    @Override
    public int printHashCode() {
        return this.hashCode();
    }

    public Service1(){
        System.out.println("Singleton bean created " + this.printHashCode());
    }

    @PostConstruct
    public void init(){
        System.out.println("@PostConstruct: Singleton Bean is now initialized");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("@PreDestroy: Singleton Bean is now destroyed");
    }
}
