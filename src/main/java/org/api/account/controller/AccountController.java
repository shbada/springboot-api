package org.api.account.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.api.account.dto.AccountDto;
import org.api.account.service.AccountService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/account")
public class AccountController {
    private final AccountService accountService;

    @GetMapping("/test")
    public String test() {
        accountService.testLog();
        return "success";
    }

    @PostMapping("/save")
    public String saveAccount(@RequestBody AccountDto accountDto) {
        accountService.saveAccount(accountDto);
        return "success";
    }

    @PostMapping("/completable-future/test")
    public String completableFutureTest() {
        accountService.completableFutureTest();
        return "success";
    }

    @PostMapping("/completable-future/foreach/test")
    public String completableFutureForEachTest() {
        accountService.completableFutureForEachTest();
        return "success";
    }
}
