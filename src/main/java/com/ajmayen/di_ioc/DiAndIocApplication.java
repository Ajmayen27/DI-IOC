package com.ajmayen.di_ioc;

import com.ajmayen.di_ioc.helper.logicHelper;
import com.ajmayen.di_ioc.model.Computer;
import com.ajmayen.di_ioc.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.net.UnknownServiceException;


@SpringBootApplication
public class DiAndIocApplication {

    public static void main(String[] args) {

//
//        //for IOC all beans are stored in application context
//        ApplicationContext applicationContext = SpringApplication.run(DiAndIocApplication.class,args);
//
//        Computer computer1 = (Computer) applicationContext.getBean("AsusVivoBook");
//        User user = new User("Aju","Rp",computer1);
//        System.out.println(user);
//
        ApplicationContext applicationContext1 = SpringApplication.run(DiAndIocApplication.class,args);

        logicHelper newLogicHelper = applicationContext1.getBean(logicHelper.class);

        newLogicHelper.printJustDemo();








        //System.out.println(computer1);







        //this is constructor injection
       // User user = new User("Ajmayen Fayek","Rangpur",computer);


        //this is setter injection
//        User user = new User("Ajmayen Fayek","Dhaka");



    }

}
