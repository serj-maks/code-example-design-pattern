package edu.patterns.proxy.ex01.after;

public class AccountServiceImpl implements AccountService {

    @Override
    public Account getById(long id) {
        return new Account(id, "123456/7890/12/1/1");
    }
}
