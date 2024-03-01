package com.me.premier.models;

public class Helloword {
    private String value="Hello World!";
    public String getValue(){
        return value;
    }
    public void setValue(String val){
        this.value=val;
    }
    public String toString(){
        return value;
    }
}
