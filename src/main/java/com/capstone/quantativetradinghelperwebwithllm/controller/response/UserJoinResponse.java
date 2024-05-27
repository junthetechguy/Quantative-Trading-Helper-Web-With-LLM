package com.capstone.quantativetradinghelperwebwithllm.controller.response;

import com.capstone.quantativetradinghelperwebwithllm.model.User;
import com.capstone.quantativetradinghelperwebwithllm.model.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserJoinResponse {
    private Integer id;
    private String userName;
    private UserRole role;

    public static UserJoinResponse fromUser(User user) {
        return new UserJoinResponse(
                user.getId(),
                user.getUsername(),
                user.getUserRole()
        );
    }

}
