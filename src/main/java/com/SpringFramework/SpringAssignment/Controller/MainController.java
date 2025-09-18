package com.SpringFramework.SpringAssignment.Controller;

import com.SpringFramework.SpringAssignment.Interface.BeanInterface;
import com.SpringFramework.SpringAssignment.Services.Service2;
import com.SpringFramework.SpringAssignment.Services.Service3;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    BeanInterface singletonBean;
    @Autowired
    //Ambiguity Condition - Since multiple classes implement BeanInterface
    //ObjectFactory<BeanInterface> prototypeBeanFactory;

    //Specific to prototype scope - Service2
    ObjectFactory<Service2> prototypeBeanfactory;
    //Service2 prototypeBeanfactory;
    @Autowired
    Service3 requestBean;

    @GetMapping("/singleton")
    public void checkSingleton() {
        System.out.println("Singleton bean created " + singletonBean.printHashCode());
    }

    @GetMapping("/prototype")
    public void checkprototype(){
        BeanInterface prototypeBean = prototypeBeanfactory.getObject();
        prototypeBean.printHashCode();
//        prototypeBeanfactory.printHashCode();
    }

    @GetMapping("/request")
    public void checkrequest(){
        requestBean.printHashCode();
    }
}
