package com.bah.msd.service;

import java.util.Optional;

import com.bah.msd.domain.Customer;

public interface CustomerService {

	public Iterable<Customer> findAllCustomers();
	public Optional<Customer> findCustomerById(long id);
}
