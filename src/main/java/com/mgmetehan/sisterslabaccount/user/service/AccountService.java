package com.mgmetehan.sisterslabaccount.user.service;

import com.mgmetehan.sisterslabaccount.user.converter.AccountConverter;
import com.mgmetehan.sisterslabaccount.user.dto.request.AccountRequestDto;
import com.mgmetehan.sisterslabaccount.user.dto.response.AccountResponse;
import com.mgmetehan.sisterslabaccount.user.model.Account;
import com.mgmetehan.sisterslabaccount.user.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;
    private final AccountConverter accountConverter;
    private final UserService userService;

    public AccountResponse save(AccountRequestDto dto) {
        Account entity = accountConverter.toEntity(dto);
        AccountResponse response = accountConverter.toResponse(
                accountRepository.save(entity));
        userService.updateAccountId(dto.getUserId(), response);
        return response;
    }

    public AccountResponse getById(Long id) {
        Optional<Account> optionalAccount = accountRepository.findById(id);
        Account account = optionalAccount.orElseThrow(() -> new RuntimeException("Id bulunamadi !!"));
        return accountConverter.toResponse(account);
    }
}
