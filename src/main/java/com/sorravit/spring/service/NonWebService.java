package com.sorravit.spring.service;

import org.springframework.stereotype.Service;

@Service
public class NonWebService {
    public void printSomething(){
        System.out.println("Something");
    }
}
