package edu.serjmaks.patterns.proxy.ex01.after;

public class Main {
    public static void main(String[] args) {
        AccountService accountService = new AccountServiceAuditProxy(new AccountServiceImpl());
        accountService.getById(1234);
    }
}
