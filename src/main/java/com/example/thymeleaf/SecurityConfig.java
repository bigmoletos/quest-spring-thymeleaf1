package com.example.thymeleaf;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/templates/**", "/index/**", "/doctor**", "/static/**", "/webjars/**",
				"/css/**", "/img/**").permitAll().anyRequest().authenticated();
//				.and().httpBasic();
//				.and().formLogin().loginPage("/login").permitAll().and()
//				.logout().permitAll();
	}

}
