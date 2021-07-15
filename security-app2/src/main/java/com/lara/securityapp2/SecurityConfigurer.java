package com.lara.securityapp2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfigurer extends WebSecurityConfigurerAdapter{

	@Autowired
	private PersonService personService;
	
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(personService);
		}
	
	
	// This method is implemented for Authorization
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.csrf().disable()  // This is required if you want to test your API in ARC or POSTMAN or Angular client
		.authorizeRequests()	
		.antMatchers("/hello1").hasRole("ADMIN")
		.antMatchers("/hello2").hasRole("ADMIN")
		.antMatchers("/hello3").hasRole("USER")
		.antMatchers("/hello4").hasRole("USER")
		
		.and()
		.httpBasic()
		.and()
		.formLogin();
}	
	
}