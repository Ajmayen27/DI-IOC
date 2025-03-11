package com.ajmayen.di_ioc.configuration;

import com.ajmayen.di_ioc.model.Computer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    protected Computer AsusVivoBook(){
        return  new Computer("Asus","L1",8,512);
    }

    @Bean
    protected Computer hpProBook(){
        return  new Computer("Hp","H1",8,256);
    }


}
