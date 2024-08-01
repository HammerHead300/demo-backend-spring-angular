package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student pepe = new Student(
                    1L,
                    "Pepe",
                    "pepe.lotas@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            Student puñeta = new Student(
                    "Puñeta",
                    "puñeta.@gmail.com",
                    LocalDate.of(2005, Month.FEBRUARY, 15)
            );

            repository.saveAll(
                    List.of(pepe, puñeta)
            );
        };
    }
}
