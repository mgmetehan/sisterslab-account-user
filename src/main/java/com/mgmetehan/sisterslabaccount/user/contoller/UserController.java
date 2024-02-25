package com.mgmetehan.sisterslabaccount.user.contoller;

import com.mgmetehan.sisterslabaccount.user.dto.request.UserRequestDto;
import com.mgmetehan.sisterslabaccount.user.dto.response.UserResponse;
import com.mgmetehan.sisterslabaccount.user.service.UserService;
import com.mgmetehan.sisterslabaccount.user.shared.endpoints.UserEndpoints;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(UserEndpoints.USERS)
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public UserResponse save(@RequestBody UserRequestDto dto) {
        return userService.saveUser(dto);
    }

    @GetMapping("/{id}")
    public UserResponse getById(@PathVariable Long id) {
        return userService.getById(id);
    }

    @GetMapping
    public List<UserResponse> getAll() {
        return userService.getAll();
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @DeleteMapping("/name")
    public void deleteByName(@RequestParam String name, @RequestParam String surname) {
        userService.deleteByName(name, surname);
    }

    @PutMapping("/{id}")
    public UserResponse updateUser(@PathVariable Long id, @RequestBody UserRequestDto dto){
        return userService.updateUser(id,dto);
    }
}
