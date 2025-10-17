package one.terenin.practice.bank.service;

import one.terenin.practice.bank.entity.Account;
import one.terenin.practice.bank.entity.Transaction;

public interface BankService {

    void createAccount(String id, String ownerName);
    void deposit(String id, double amount);
    void withdraw(String id, double amount);
    void showTransactions(String id);
    void exit();

}
