package com.testapp4.JobClient;

import com.testapp4.JobClient.jobTypes.JobTypeRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JobClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobClientApplication.class, args);
	}

	@Bean
	ApplicationRunner init(JobPostRepository repository, JobTypeRepository jobTypeRepository){
		return args -> {
			repository.findAll().forEach(System.out::println);
			jobTypeRepository.findAll().forEach(System.out::println);
		};
	}
}
