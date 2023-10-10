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
    CommandLineRunner  commandLineRunner(StudentRepository repository){
        return args -> {
            Student  mariam = new Student(
                            "Mariam",
                            "mariam.jemal@hotmail.com",
                            LocalDate.of(2000, Month.JANUARY,10));
            Student  alex = new Student(
                    "alex",
                    "alex.jemal@hotmail.com",
                    LocalDate.of(2004, Month.FEBRUARY,4));
            Student  Yalew = new Student(
                    "Yalew",
                    "yalew.a@hotmail.com",
                    LocalDate.of(1986, Month.DECEMBER,4));
            repository.saveAll(
                    List.of(mariam, alex, Yalew)
            );
        };
    }
}
