package com.example.four_simm.controller;

import com.example.four_simm.model.responseDto.UserDto;
import com.example.four_simm.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/users")
@Tag(name = "User Controller", description = "Endpoints for managing users")
public class UserController {
    private final UserService userService;

    @GetMapping
    @Operation(summary = "Get all users", description = "Retrieve a list of all users")
    public List<UserDto> getUsers(){
        return userService.getUsers();
    }
}
