package com.customer.satin.controller;

import com.customer.satin.dto.Request;
import com.customer.satin.dto.Response;
import com.customer.satin.entity.Customer;
import com.customer.satin.repository.CustomerRepository;
import com.customer.satin.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {


    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/enterCustomer")
    public Customer enterCustomer(@RequestBody Request request){
        return customerRepository.save(request.getCustomer());
    }

    @GetMapping("/findAll")
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    @GetMapping("/findInfo")
    public List<Response> getJoinInfo(){
        return customerRepository.getJoinInfo();
    }

    @GetMapping("/findEmailPrice")
    public List<Response> findEmailPrice(){
        return customerRepository.findEmailPrice();
    }





}
