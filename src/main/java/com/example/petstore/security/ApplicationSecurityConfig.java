package com.example.petstore.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import static com.example.petstore.security.ApplicationUserRole.*;

@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public ApplicationSecurityConfig(PasswordEncoder passwordEncoder){
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/index.html").permitAll()
                .antMatchers( "/resources/**", "/static/**", "/css/**", "/js/**", "/images/**", "/icon/**", "/fonts/**", "/media/**", "/php/**", "/scss/**").permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/login").permitAll()
                .loginProcessingUrl("/login")
                .defaultSuccessUrl("/index.html", true);
    }

    @Override
    @Bean
    protected UserDetailsService userDetailsService(){
        UserDetails njs = User.builder()
                .username("nurzhas")
                .password(passwordEncoder.encode("pass"))
                .roles(USER.name())
                .build();

        UserDetails user2 = User.builder()
                .username("nurda")
                .password(passwordEncoder.encode("pass"))
                .roles(ADMIN.name())
                .build();


        return new InMemoryUserDetailsManager(njs, user2);
    }
}
