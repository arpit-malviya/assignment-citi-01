package com.hashedin.assignmentcitibank.repository;

import com.hashedin.assignmentcitibank.entity.Customer;
import jakarta.persistence.Id;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
}
