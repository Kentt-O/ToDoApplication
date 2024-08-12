package com.anything.service.implementation;

import com.anything.data.repository.UserRepository;
import com.anything.dtos.request.RegisterRequest;
import com.anything.dtos.response.RegisterResponse;
import com.anything.exception.UserNameExistsException;
import com.anything.exception.UserNameNotFoundException;
import com.anything.service.interfacePack.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.anything.utils.Mapper.registerResponse;
import static com.anything.utils.Mapper.userMapper;
import com.anything.data.model.User;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public RegisterResponse register(RegisterRequest registerRequest) throws UserNameExistsException, UserNameNotFoundException {
        if (userDetails(registerRequest.getUsername())){
            throw new UserNameExistsException("Username taken, try another");
        }
        User userInfo = userMapper(registerRequest.getUsername(),registerRequest.getPassword());
        userRepository.save(userInfo);
        return registerResponse("Registration successful");
    }

    private Boolean userDetails(String username) throws UserNameNotFoundException {
        User user = userRepository.findByUsername(username);
        return  user != null;
    }
}
