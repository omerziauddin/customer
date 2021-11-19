package com.customer.satin.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Response {
    private String name;
    private String email;
    private String gender;

    private int pid;
    private int price;
    private String productName;
    private int qty;

    public Response(String name, String productName) {
        this.name = name;
        this.productName = productName;
    }

    public Response(String email, int price) {
        this.email = email;
        this.price = price;
    }
}
