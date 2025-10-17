package one.terenin.practice.bank.entity;

import java.time.LocalDateTime;

public class Transaction {
    private String id;
    private String type; // "DEPOSIT" or "WITHDRAW" -> change to enum
    private double amount;
    private LocalDateTime timestamp;

}
