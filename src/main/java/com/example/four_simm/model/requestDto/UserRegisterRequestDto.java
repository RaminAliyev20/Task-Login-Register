package com.example.four_simm.model.requestDto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRegisterRequestDto {
    String firstname;
    String lastname;
    String email;
    String password;
    String repeatPassword;

}