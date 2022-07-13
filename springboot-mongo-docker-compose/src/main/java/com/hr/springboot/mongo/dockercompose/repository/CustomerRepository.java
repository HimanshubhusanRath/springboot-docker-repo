package com.hr.springboot.mongo.dockercompose.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hr.springboot.mongo.dockercompose.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String>{

}
