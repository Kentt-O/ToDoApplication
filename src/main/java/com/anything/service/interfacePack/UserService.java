package com.anything.service.interfacePack;

import com.anything.dtos.request.RegisterRequest;
import com.anything.dtos.response.RegisterResponse;
import com.anything.exception.UserNameExistsException;
import com.anything.exception.UserNameNotFoundException;

public interface UserService {

    RegisterResponse register(RegisterRequest registerRequest) throws UserNameExistsException, UserNameNotFoundException;

}
