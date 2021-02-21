package com.example.demopagination.service.api;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demopagination.entities.Customer;

public interface CustomerSrviceAPI {

	Page<Customer> gettAll (Pageable pageable);
	
}
