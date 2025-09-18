package com.SpringFramework.SpringAssignment.Services;

import com.SpringFramework.SpringAssignment.Interface.BeanInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("singletonBean")
public class Service1 implements BeanInterface {

    @Override
    public int printHashCode() {
        return this.hashCode();
    }

    public Service1(){
        System.out.println("Singleton bean created " + this.printHashCode());
    }
}
