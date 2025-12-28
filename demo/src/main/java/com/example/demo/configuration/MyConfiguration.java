package com.example.demo.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class MyConfiguration {

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder){
        UserDetails u1 = User
                         .withUsername("nithin")
                         .password(passwordEncoder.encode("nithin123"))
                         .roles("ADMIN")
                         .build();

         UserDetails u2 = User
                         .withUsername("merlin")
                         .password(passwordEncoder.encode("merlin123"))
                         .roles("USER")
                         .build(); 
        return new InMemoryUserDetailsManager(u1,u2);             
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        return http
               .csrf(csrf->csrf.disable())
               .authorizeHttpRequests(req->req
                                      .requestMatchers("/api/students").permitAll()
                                      .requestMatchers("/api/students/post").hasRole("ADMIN")
                                      .requestMatchers("/api/students/get**").hasAnyRole("ADMIN","USER")
                                      .requestMatchers("/api/students/put").hasRole("USER")
                                      .anyRequest().authenticated())
               .sessionManagement(ses->ses.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
               .httpBasic(Customizer.withDefaults())
               .build();
               
    }

    @Bean
    public AuthenticationProvider authenticationProvider(UserDetailsService uds, PasswordEncoder pe){
        DaoAuthenticationProvider dao = new DaoAuthenticationProvider(uds);
        dao.setPasswordEncoder(pe);
        return dao;
    }

}
