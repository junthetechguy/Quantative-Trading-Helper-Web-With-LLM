package com.capstone.quantativetradinghelperwebwithllm.fixture;


import com.capstone.quantativetradinghelperwebwithllm.model.entity.UserEntity;

public class UserEntityFixture {
    public static UserEntity get(String userName, String password, Integer userId) {
        UserEntity result = new UserEntity();
        result.setId(userId);
        result.setUserName(userName);
        result.setPassword(password);
        return result;
    }
}
