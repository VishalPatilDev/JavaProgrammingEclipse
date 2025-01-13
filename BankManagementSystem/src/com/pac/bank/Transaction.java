

package com.pac.bank;

import java.util.Date;

public class Transaction {
    private String transactionType;
    private double amount;
    private double balanceAfterTransaction;
    private Date transactionDate;

    public Transaction(String transactionType, double amount, double balanceAfterTransaction) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.balanceAfterTransaction = balanceAfterTransaction;
        this.transactionDate = new Date();
    }

    public String getTransactionDetails() {
        return String.format("%-20s: %s%n%-20s: Rs. %.2f%n%-20s: Rs. %.2f%n%-20s: %s%n",
                "Transaction Type", transactionType,
                "Amount", amount,
                "Balance After Transaction", balanceAfterTransaction,
                "Date", transactionDate);
    }
}

