package com.capstone.quantativetradinghelperwebwithllm.controller;

import com.capstone.quantativetradinghelperwebwithllm.controller.request.UserJoinRequest;
import com.capstone.quantativetradinghelperwebwithllm.controller.request.UserLoginRequest;
import com.capstone.quantativetradinghelperwebwithllm.controller.response.Response;
import com.capstone.quantativetradinghelperwebwithllm.controller.response.UserJoinResponse;
import com.capstone.quantativetradinghelperwebwithllm.controller.response.UserLoginResponse;
import com.capstone.quantativetradinghelperwebwithllm.model.User;
import com.capstone.quantativetradinghelperwebwithllm.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/join")
    public Response<UserJoinResponse> join(@RequestBody UserJoinRequest request) {
        User user = userService.join(request.getName(), request.getPassword());
        return Response.success(UserJoinResponse.fromUser(user));
    }

    @PostMapping("/login")
    public Response<UserLoginResponse> login(@RequestBody UserLoginRequest request) {
        String token = userService.login(request.getName(), request.getPassword());
        return Response.success(new UserLoginResponse(token));
    }


}
