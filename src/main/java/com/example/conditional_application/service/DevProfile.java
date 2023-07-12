package com.example.conditional_application.service;

public class DevProfile implements SystemProfile{
    @Override
    public String getProfile(){
        return "Current profile is dev";
    }
}
