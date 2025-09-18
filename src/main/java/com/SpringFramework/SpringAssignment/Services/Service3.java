package com.SpringFramework.SpringAssignment.Services;

import com.SpringFramework.SpringAssignment.Interface.BeanInterface;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component("requestBean")
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Service3 implements BeanInterface {

    @Override
    public int printHashCode() {
        return this.hashCode();
    }

    public Service3(){
        System.out.println("Request bean created " + this.printHashCode());
    }
}
