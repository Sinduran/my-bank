package com.abc;

import static java.lang.Math.abs;

import java.util.Date;

public class Transaction {
    private final double amount;
    private final Date transactionDate;

    public Transaction(double amount) {
        this.amount = amount;
        this.transactionDate = DateProvider.getInstance().now();
    }
    
    public double getTransactionAmount() {
      return amount;
    }
    
    public Date getTransactionDate() {
      return transactionDate;
    }
   
}
