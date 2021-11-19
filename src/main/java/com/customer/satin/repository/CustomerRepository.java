package com.customer.satin.repository;

import com.customer.satin.dto.Response;
import com.customer.satin.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    @Query("SELECT new com.customer.satin.dto.Response(c.name,p.productName) FROM Customer c JOIN c.products p")
    List<Response> getJoinInfo();


    @Query("SELECT new com.customer.satin.dto.Response(c.email,p.price) FROM Customer c JOIN c.products p")
    List<Response> findEmailPrice();
}
