package com.ajmayen.di_ioc;

import com.ajmayen.di_ioc.model.Computer;
import com.ajmayen.di_ioc.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiAndIocApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiAndIocApplication.class, args);


        Computer computer = new Computer("Hp","Elite Book",16,512);

        //this is constructor injection
        User user = new User("Ajmayen Fayek","Rangpur",computer);


        //this is setter injection
//        User user = new User("Ajmayen Fayek","Dhaka");
        user.setComputer(computer);

        System.out.println(user);
    }

}
