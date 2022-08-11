package edu.patterns.proxy.ex01.after;

import java.util.Date;

public class AccountServiceAuditProxy implements AccountService {

    private final AccountService accountService;

    public AccountServiceAuditProxy(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public Account getById(long id) {
        Account account = accountService.getById(id);
        System.out.println("В " + new Date() + " просмотрен аккаунт с id: " + id);
        return account;
    }
}
