package com.example.four_simm.mapper;

import com.example.four_simm.dao.entity.UserEntity;
import com.example.four_simm.model.requestDto.UserRequestDto;
import com.example.four_simm.model.responseDto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class UserMapper {
    public static final UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    public abstract UserEntity mapRequestDtoToEntity(UserRequestDto userRequestDto);

    public abstract List<UserDto> mapEntityListToDtoList(List<UserEntity> userEntityList);

}