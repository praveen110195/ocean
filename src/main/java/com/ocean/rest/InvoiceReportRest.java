package com.ocean.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class InvoiceReportRest {

    @GetMapping("/invoice-data")
    ResponseEntity<String> getInvoiceDetail(){
        return new ResponseEntity<>("Invoice Detail", HttpStatus.OK);
    }

}
