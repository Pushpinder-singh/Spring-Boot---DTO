package com.pushp.Spring.Boot_DTO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDtoApplication {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OfficeLocationRepository officeLocationRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDtoApplication.class, args);
	}

// Adding data to H2 Database
	@Override
	public void run(String... args) throws Exception {

		// Office location
		OfficeLocation location = new OfficeLocation();
		location.setPlace("Toronto");
		location.setDescription("Toronto is great place to work");
		location.setLongitude(40.5);
		location.setLatitude(30.6);
		officeLocationRepository.save(location);
	

	// Adding Users
		User user1 = new User();
		user1.setFirstName("Pushpinder");
		user1.setLastName("Singh");
		user1.setEmail("impushp@gmail.com");
		user1.setPassword("secret");
		user1.setLocation(location);
		userRepository.save(user1);

		User user2 = new User();
		user2.setFirstName("Johny");
		user2.setLastName("Patrick");
		user2.setEmail("jP@gmail.com");
		user2.setPassword("secret");
		user2.setLocation(location);
		userRepository.save(user2);
	
	}
}
