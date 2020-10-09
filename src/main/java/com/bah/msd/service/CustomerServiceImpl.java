package com.bah.msd.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.bah.msd.domain.Customer;
import com.bah.msd.repository.CustomersRepo;

public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomersRepo repo;
	
	public Iterable<Customer> findAllCustomers() {
		return repo.findAll();
	}
	
	public Optional<Customer> findCustomerById(long id){
		return repo.findById(id);
	}

}
