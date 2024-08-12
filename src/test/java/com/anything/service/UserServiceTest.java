package com.anything.service;

import com.anything.dtos.request.RegisterRequest;
import com.anything.dtos.response.RegisterResponse;
import com.anything.exception.UserNameExistsException;
import com.anything.exception.UserNameNotFoundException;
import com.anything.service.interfacePack.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    public RegisterRequest registerRequest(String name,String password){
        RegisterRequest registerRequest = new RegisterRequest();
        registerRequest.setUsername(name);
        registerRequest.setPassword(password);
        return registerRequest;
    }

    @Test
    public void test_That_User_Can_Register() throws UserNameExistsException, UserNameNotFoundException {
        RegisterRequest registerRequestData = registerRequest("Tomi","Trouble");

        RegisterResponse registerResponse = userService.register(registerRequestData);
        assertThat(registerResponse).isNotNull();
    }

    @Test
    public void testThatUserCannotRegisterTheSameNameTwice(){
        RegisterRequest registerRequestData = registerRequest("Sam","Trouble");
       assertThrows(UserNameExistsException.class, () ->  userService.register(registerRequestData));
    }
}