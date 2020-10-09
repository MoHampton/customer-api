package com.bah.msd.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.bah.msd.domain.Customer;

public interface CustomersRepository extends CrudRepository<Customer, Long> {

	boolean existsByName(String name);
	boolean existsByEmail(String email);
	
	void deleteByName(String name);
	Optional<Customer> findByName(String name);

}
