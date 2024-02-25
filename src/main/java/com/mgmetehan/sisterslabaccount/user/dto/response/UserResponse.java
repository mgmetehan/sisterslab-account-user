package com.mgmetehan.sisterslabaccount.user.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserResponse {
    private Long id;
    private Long accountId;
    private Date createdDate;
    private Date updatedDate;
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private String password;
}
