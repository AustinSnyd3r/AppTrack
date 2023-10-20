package com.Appy.Appy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Appy.Appy.repository.AppRepository;

@RestController
@RequestMapping("/app")
public class AppController {
    
    @Autowired
    private AppRepository appRepository;
}
