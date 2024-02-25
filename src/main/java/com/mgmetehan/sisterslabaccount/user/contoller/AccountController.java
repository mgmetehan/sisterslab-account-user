package com.mgmetehan.sisterslabaccount.user.contoller;

import com.mgmetehan.sisterslabaccount.user.dto.request.AccountRequestDto;
import com.mgmetehan.sisterslabaccount.user.dto.response.AccountResponse;
import com.mgmetehan.sisterslabaccount.user.service.AccountService;
import com.mgmetehan.sisterslabaccount.user.shared.endpoints.AccountEndpoints;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(AccountEndpoints.ACCOUNT)
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @PostMapping
    public AccountResponse save(@RequestBody AccountRequestDto dto) {
        return accountService.save(dto);
    }

    @GetMapping("/{id}")
    public AccountResponse getById(@PathVariable Long id){
        return accountService.getById(id);
    }
}
