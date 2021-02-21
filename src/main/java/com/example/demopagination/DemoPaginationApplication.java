package com.example.demopagination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import com.example.demopagination.entities.Customer;
import com.example.demopagination.repository.CustomerRepositiry;

@SpringBootApplication
public class DemoPaginationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoPaginationApplication.class, args);
	}

}
