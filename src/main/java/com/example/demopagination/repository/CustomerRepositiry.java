package com.example.demopagination.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demopagination.entities.Customer;

public interface CustomerRepositiry extends JpaRepository<Customer, Long >{
	

}
