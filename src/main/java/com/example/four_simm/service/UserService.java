package com.example.four_simm.service;


import com.example.four_simm.dao.entity.UserEntity;
import com.example.four_simm.dao.repository.UserRepository;
import com.example.four_simm.mapper.UserMapper;
import com.example.four_simm.model.responseDto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<UserDto> getUsers(){
        List<UserEntity> list=userRepository.findAll();
        return UserMapper.INSTANCE.mapEntityListToDtoList(list);
    }

}