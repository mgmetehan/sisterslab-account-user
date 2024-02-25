package com.mgmetehan.sisterslabaccount.user.model;

import com.mgmetehan.sisterslabaccount.user.core.model.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usr")
public class User extends BaseModel {
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private String password;
    @ManyToOne(fetch = FetchType.LAZY)
    private Account account;
}
