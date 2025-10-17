package one.terenin.practice.bank.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts = new HashMap<>();
    private Map<String, List<Transaction>> transactions = new HashMap<>();
}