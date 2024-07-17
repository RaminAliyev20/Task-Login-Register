package com.example.four_simm.model.responseDto;

import lombok.*;
import lombok.experimental.FieldDefaults;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDto {

    Long id;
    String firstname;
    String lastname;
    String phoneNumber;
    String email;
    String password;


}
