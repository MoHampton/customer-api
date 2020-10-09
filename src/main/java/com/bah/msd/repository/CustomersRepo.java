package com.bah.msd.repository;

import org.springframework.data.repository.CrudRepository;

import com.bah.msd.domain.Customer;

public interface CustomersRepo extends CrudRepository<Customer, Long> {

}
