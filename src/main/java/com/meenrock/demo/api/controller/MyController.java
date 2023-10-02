package com.meenrock.demo.api.controller;

import org.springframework.web.bind.annotation.RestController;
import com.meenrock.demo.api.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class MyController {

    private final DatabaseService database_service;
    @Autowired
    public MyController(DatabaseService databaseService) {
        this.database_service = databaseService;
    }
}
