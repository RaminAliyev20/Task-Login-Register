package com.example.four_simm.model.requestDto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRequestDto {
    String firstname;
    String lastname;
    String phoneNumber;
    String email;
    String password;

}