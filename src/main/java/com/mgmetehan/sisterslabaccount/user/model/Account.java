package com.mgmetehan.sisterslabaccount.user.model;

import com.mgmetehan.sisterslabaccount.user.core.model.BaseModel;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Account extends BaseModel {
    private String name;

    @OneToMany(mappedBy = "account", cascade = CascadeType.MERGE, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<User> users = new ArrayList<>();

}
