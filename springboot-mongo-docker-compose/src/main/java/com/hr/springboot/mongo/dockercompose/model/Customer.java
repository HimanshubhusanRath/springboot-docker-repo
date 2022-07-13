package com.hr.springboot.mongo.dockercompose.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("customers")
public class Customer {

	@Id
	private String id;
	private String customerName;
}
