package com.crio.starter.config;

import java.util.Random;
import com.crio.starter.service.ServiceHelperMethods;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfigClass {

    @Bean
    public Random random() {
        return new Random();
    }

    @Bean
    public ServiceHelperMethods serviceHelper() {
        return new ServiceHelperMethods();
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
