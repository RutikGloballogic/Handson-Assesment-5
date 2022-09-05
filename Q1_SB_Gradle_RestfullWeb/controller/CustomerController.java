package com.example.demo.controller;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CustomerRepo;

import com.example.demo.model.Customer;

@RestController

public class CustomerController

{

 @Autowired

 CustomerRepo repo;

 
// insert record 
 
 @PostMapping(path="/customer",consumes= {"application/json"})

 public Customer addCustomer(@RequestBody Customer customer)

 {

 repo.save(customer);

 return customer;

 }
 
 
 // select/Get  all records

 @GetMapping(path="/customers")

 public List<Customer> getCustomer()

 {

 return repo.findAll();

 }

 @RequestMapping("/customer/{customerid}")

 public Optional<Customer> getAlien(@PathVariable("customerid")int customerid)

 {

 return repo.findById(customerid);

 }
 
 
 //delete record
 

 @DeleteMapping("/customer/{customerid}")

 public String deleteAlien(@PathVariable int customerid)

 {

 Customer c = repo.getOne(customerid);

 repo.delete(c);

 return "deleted";

 }
 
 
 
 //update record

 @PutMapping(path="/customer",consumes= {"application/json"})

 public Customer saveOrUpdateCustomer(@RequestBody Customer customer)

 {

 repo.save(customer);

 return customer;

 }

}

