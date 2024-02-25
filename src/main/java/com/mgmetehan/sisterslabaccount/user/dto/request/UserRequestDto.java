package com.mgmetehan.sisterslabaccount.user.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDto {
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private String password;
}
