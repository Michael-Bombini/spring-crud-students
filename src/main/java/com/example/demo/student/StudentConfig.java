package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mario = new Student(
                    "mario",
                    "mario@gmail.com",
                    LocalDate.of(2000, 5, 12)
            );

            repository.saveAll(List.of(mario));
        };
    }
}
