package com.jpa.demo;

import com.jpa.demo.entity.User;
import com.jpa.demo.repositories.userRepository;
import com.jpa.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	UserService userService;
	@Autowired
	userRepository userRepository;

	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);

	}
	@Override
	public void run(String... args) throws Exception {
//		var user = new User();
//		user.setUserId(2001);
//		user.setUserName("Ravi Chandola");
//		user.setEmail("ravichandola@gmail.com");
//		userService.saveUser(user);
		userRepository.findAll().forEach(item->{
			IO.println(item.getUserName());
		} );
	}

}
