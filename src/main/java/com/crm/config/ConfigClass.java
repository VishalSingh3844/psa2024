package com.crm.config;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class ConfigClass {
    @Bean
    public ModelMapper getMapper(){
        return new ModelMapper();
    }
}
