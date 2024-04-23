package com.aishna.journalapp.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    public String healthCheck() {
        return "OK";
    }
}
