package com.pneumo.csrfdemo3.config;

import com.pneumo.csrfdemo3.controller.filter.CsrfTokenLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CsrfFilter;

@Configuration
public class ProjectConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Throwable {
        http.addFilterAfter(new CsrfTokenLogger(), CsrfFilter.class)
                .authorizeHttpRequests()
                .anyRequest()
                .permitAll()
                .and()
                .httpBasic();
        return http.build();
    }
}
