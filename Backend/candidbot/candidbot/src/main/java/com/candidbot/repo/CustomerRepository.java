package com.candidbot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.candidbot.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
