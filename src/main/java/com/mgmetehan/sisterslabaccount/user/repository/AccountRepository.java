package com.mgmetehan.sisterslabaccount.user.repository;

import com.mgmetehan.sisterslabaccount.user.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
