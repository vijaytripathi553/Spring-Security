package com.lara.securityapp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//@SpringBootApplication//(scanBasePackages={
//"com.lara.service.PersonService", "com.lara.repository","com.lara.entity"})
//@ComponentScan("com.lara.service.PersonService")
//@ComponentScan({ "com.lara.*" })
@SpringBootApplication
@ComponentScan({ "com" })
public class SecurityApp2Application implements CommandLineRunner{
	
	@Autowired
	private PersonService personService;
	
	public static void main(String[] args) {
		SpringApplication.run(SecurityApp2Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Person person1 = new Person();
		person1.setUsername("abc");
		person1.setPassword(getPasswordEncoder().encode("xyz"));
		person1.setRole("ROLE_ADMIN");		
		Person person2 = new Person();
		person2.setUsername("test");
		person2.setPassword(getPasswordEncoder().encode("hello"));
		person2.setRole("ROLE_USER");		
		Person person3 = new Person();
		person3.setUsername("vijay");
		person3.setPassword(getPasswordEncoder().encode("hello"));
		person3.setRole("ROLE_HR");		

		personService.save(person1);
		personService.save(person2);
		personService.save(person3);
		
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	

}
