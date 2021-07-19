package com.juncture.backend.common;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserUtils {
    public UserUtils(){

    }
    public String getRandomUserId(){
        return UUID.randomUUID().toString();
    }
}
