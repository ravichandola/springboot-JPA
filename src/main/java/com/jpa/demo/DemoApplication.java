package com.jpa.demo;

import com.jpa.demo.entity.Product;
import com.jpa.demo.entity.User;
import com.jpa.demo.repositories.ProductRepository;
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
	@Autowired
	ProductRepository productRepository;

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
//

		var product1 = new Product();
		product1.setTitle("Iphone 6");
		product1.setDescription("This is product description");
		product1.setShortDescription("This is product short description");
		product1.setLive(true);
		product1.setOutOfStock(false);
		product1.setPrice(123900.00);
		productRepository.save(product1);
		System.out.println("product saved successfully");
		productRepository.findByTitle("Iphone 6").forEach(item->IO.println(product1.getTitle()+"\n"+item.getDescription()+"\n"+item.getShortDescription()));
	}

}
