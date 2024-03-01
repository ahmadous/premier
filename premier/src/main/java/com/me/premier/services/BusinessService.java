package com.me.premier.services;

import com.me.premier.models.Helloword;

import org.springframework.stereotype.Component;
/**
 * BusinessServices
 */
@Component
public class BusinessService{
    Helloword hw=new Helloword();
    public Helloword getGetHelloword(){
        return hw;
    }
    public Object getHelloWorld() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHelloWorld'");
    };
}