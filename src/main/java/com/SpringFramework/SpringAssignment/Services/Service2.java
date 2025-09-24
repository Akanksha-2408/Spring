package com.SpringFramework.SpringAssignment.Services;

import com.SpringFramework.SpringAssignment.Interface.BeanInterface;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component("prototypeBean")
//@Primary
@Scope("prototype")
public class Service2 implements BeanInterface {

    @Override
    public int printHashCode() {
        return this.hashCode();
    }

    public Service2(){
        System.out.println("Prototype bean created " + this.printHashCode());
    }

    @PostConstruct
    public void init(){
        System.out.println("@PostConstruct: Prototype Bean is now initialized");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("@PreDestroy: Prototype Bean is now destroyed");
    }
}
