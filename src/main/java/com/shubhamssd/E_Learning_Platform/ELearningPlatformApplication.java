package com.shubhamssd.E_Learning_Platform;

import com.shubhamssd.E_Learning_Platform.models.Author;
import com.shubhamssd.E_Learning_Platform.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ELearningPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(ELearningPlatformApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository repository
	){
		return args ->{
			var author = Author.builder()
					.firstName("Shubham")
					.lastName("Dhanvate")
					.email("shubhamssd10@gmail.com")
					.age(22)
					.build();
			repository.save(author);
		};

	}

}
