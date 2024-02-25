package com.mgmetehan.sisterslabaccount.user.repository;

import com.mgmetehan.sisterslabaccount.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
    User findByNameAndSurname(String name,String surname);

}
