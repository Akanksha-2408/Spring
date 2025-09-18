package com.SpringFramework.SpringAssignment.Services;

import com.SpringFramework.SpringAssignment.Interface.BeanInterface;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

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
}
