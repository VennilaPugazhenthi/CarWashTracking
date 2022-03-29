package com.vanavil.CarWashTracking;

import com.vanavil.CarWashTracking.model.Address;
import com.vanavil.CarWashTracking.model.User;
import com.vanavil.CarWashTracking.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@SpringBootApplication
public class CarWashTrackingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarWashTrackingApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserRepository repository){
		return args -> {
			Address address = new Address(
					"531 Highspire Road",
					"",
					"Glenmoore",
					"PA",
					"19343"
			);
			User user = new User(
					"Vennila",
					"Pugazhenthi",
					"7178312301",
					"vennilapugazhenthi@gmail.com",
					List.of("12345"),
					address,
					LocalDateTime.now()
			);
			repository.insert(user);
		};
	}
}
