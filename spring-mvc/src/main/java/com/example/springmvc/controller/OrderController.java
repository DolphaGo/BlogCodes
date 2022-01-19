package com.example.springmvc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/api/v1/order")
@RestController
public class OrderController {

    @GetMapping("/abc/{orderId}")
    public ResponseEntity<String> getOrder(@PathVariable("orderId") String orderId) {
        log.info("getOrder request ..................... orderId={}", orderId);
        return ResponseEntity.ok("orderId =" + orderId);
    }
}
