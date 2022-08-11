package edu.patterns.proxy.ex01.after;

public class Account {

    private final long id;
    private final String accountNumber;

    public Account(long id, String accountNumber) {
        this.id = id;
        this.accountNumber = accountNumber;
    }

    public long getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
