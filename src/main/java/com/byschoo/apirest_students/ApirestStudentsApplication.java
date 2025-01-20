package com.byschoo.apirest_students;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;


@SpringBootApplication
@EnableEncryptableProperties
public class ApirestStudentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApirestStudentsApplication.class, args);
	}

}
