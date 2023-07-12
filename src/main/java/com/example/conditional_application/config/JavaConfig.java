package com.example.conditional_application.config;

import com.example.conditional_application.service.DevProfile;
import com.example.conditional_application.service.ProductionProfile;
import com.example.conditional_application.service.SystemProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @ConditionalOnProperty(value = "profile.dev",havingValue = "true")
    @Bean
    public SystemProfile devProfile(){
        return new DevProfile();
    }
    @ConditionalOnProperty(value = "profile.dev",havingValue = "false")
    @Bean
    public SystemProfile productionProfile(){
        return new ProductionProfile();
    }
}
