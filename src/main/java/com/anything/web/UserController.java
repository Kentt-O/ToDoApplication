package com.anything.web;

import com.anything.dtos.request.RegisterRequest;
import com.anything.dtos.response.RegisterResponse;
import com.anything.service.interfacePack.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest registerRequest){
        try{
            RegisterResponse registerResponse = userService.register(registerRequest);
            return ResponseEntity.ok().body(registerResponse);
        }catch (Exception exception){
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }

}
