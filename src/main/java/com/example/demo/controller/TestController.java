package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.payloads.responses.MessageResponse;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TestController {
@GetMapping("/test")
    public ResponseEntity<MessageResponse> test() {
        return ResponseEntity.ok(new MessageResponse("This is a test controller for Authentication"));
    }
}
