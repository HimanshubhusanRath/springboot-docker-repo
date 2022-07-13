package com.hr.springboot.mongo.dockercompose;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hr.springboot.mongo.dockercompose.model.Customer;
import com.hr.springboot.mongo.dockercompose.repository.CustomerRepository;

@SpringBootApplication
@RestController
@RequestMapping("/customer")
public class SpringbootMongoDockerComposeApplication {

	@Autowired
	private CustomerRepository customerRepository;
	
	@PostMapping("/add")
	public Customer saveCustomer(@RequestBody final Customer customer)
	{
		return customerRepository.save(customer);
	}
	
	@GetMapping("/all")
	public List<Customer> getAllCustomers()
	{
		return customerRepository.findAll();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongoDockerComposeApplication.class, args);
	}

}
