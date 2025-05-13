package com.base.mybase.service;

import com.base.mybase.dto.UserDTO;
import com.base.mybase.mapper.UserMapper;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

    public UserDTO getUser(Long id) {
        return userMapper.findUserById(id);
    }
}
