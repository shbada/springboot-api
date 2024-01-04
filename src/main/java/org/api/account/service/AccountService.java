package org.api.account.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.api.account.domain.Account;
import org.api.account.domain.AccountRepository;
import org.api.account.dto.AccountDto;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;

    public void testLog() {
        log.info("test");
    }

    public void saveAccount(AccountDto accountDto) {
        Account account = accountDto.toEntity();
        accountRepository.save(account);
    }
}
