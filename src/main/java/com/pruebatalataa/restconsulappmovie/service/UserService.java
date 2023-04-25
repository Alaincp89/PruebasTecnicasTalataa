package com.yoandypv.restconsulappmovie.service;


import com.yoandypv.restconsulappmovie.service.dto.user.login.LoginRequest;
import com.yoandypv.restconsulappmovie.service.dto.user.login.LoginResponse;
import com.yoandypv.restconsulappmovie.service.dto.user.register.RegisterUserRequest;
import com.yoandypv.restconsulappmovie.service.dto.user.register.RegisteredUserResponse;

public interface UserService {
    RegisteredUserResponse create(RegisterUserRequest user);
    LoginResponse login(LoginRequest loginRequest);
}
