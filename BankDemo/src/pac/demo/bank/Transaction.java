

package pac.demo.bank;

import java.util.Date;

public class Transaction {
     String transactionType;
     double amount;
     double balanceAfterTransaction;
     Date transactionDate;

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

