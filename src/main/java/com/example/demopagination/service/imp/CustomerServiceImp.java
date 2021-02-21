package com.example.demopagination.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demopagination.entities.Customer;
import com.example.demopagination.repository.CustomerRepositiry;
import com.example.demopagination.service.api.CustomerSrviceAPI;

@Service
public class CustomerServiceImp implements CustomerSrviceAPI {

	@Autowired
	private CustomerRepositiry customerRepository;
	
	
	@Override
	public Page<Customer> gettAll(Pageable pageable) {
		return customerRepository.findAll(pageable);
	}

	
	
}
