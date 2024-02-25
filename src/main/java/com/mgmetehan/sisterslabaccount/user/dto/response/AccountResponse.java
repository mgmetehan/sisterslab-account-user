package com.mgmetehan.sisterslabaccount.user.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AccountResponse {
    private Long id;
    private Long userId;
    private Date createdDate;
    private Date updatedDate;
    private String name;
}
