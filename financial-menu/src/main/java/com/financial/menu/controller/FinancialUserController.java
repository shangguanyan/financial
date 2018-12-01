package com.financial.menu.controller;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class FinancialUserController {

    @PostMapping("/logout")
    public ResponseEntity logout(){
        return ResponseEntity.ok(Response.SC_OK);
    }
}
