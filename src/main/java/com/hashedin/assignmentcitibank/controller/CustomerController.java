package com.hashedin.assignmentcitibank.controller;

import com.hashedin.assignmentcitibank.entity.Address;
import com.hashedin.assignmentcitibank.entity.Customer;
import com.hashedin.assignmentcitibank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/citi")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @PostMapping("/register-customer")
    public ResponseEntity<Customer> registerCustomer(@RequestBody Customer customer){
        return ResponseEntity.ok(customerRepository.save(customer));
    }

    @GetMapping("/get-all")
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    @DeleteMapping("/delete-customer-by-id")
    public Optional<Customer> deleteCustomer(@RequestParam("id") String id){
         Optional<Customer> customer = customerRepository.findById(id);
         customerRepository.deleteById(id);
         return customer;
    }

    @PutMapping("/update-customer")
    public Customer updateCustomer(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }

}
