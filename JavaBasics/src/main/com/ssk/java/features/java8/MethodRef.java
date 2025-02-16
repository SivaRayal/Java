package main.com.ssk.java.features.java8;

import java.util.ArrayList;
import java.util.List;

public class MethodRef {
    public static void main(String[] args) {

        List<Expense> expenses = new ArrayList<>();
        expenses.add(new Expense("Rent",25000.00,"DR","Bank","Bills"));
        expenses.add(new Expense("Grocessories",15000.00,"DR","UPI","Bills"));
        expenses.add(new Expense("LIC Policy",15000.00,"DR","UPI","Investment"));
        expenses.add(new Expense("Salary",75000.00,"CR","Bank","Income"));

        expenses.stream().map(Expense::getExpenseName).forEach(System.out::println);
    }
}

class Expense{
    private String expenseName;
    private double amount;
    private String expenseType;
    private String transactionType;
    private String category;

    public String getExpenseName() {
        return expenseName;
    }

    public Expense(String expenseName, double amount, String expenseType, String transactionType, String category) {
        this.expenseName = expenseName;
        this.amount = amount;
        this.expenseType = expenseType;
        this.transactionType = transactionType;
        this.category = category;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "expenseName='" + expenseName + '\'' +
                ", amount=" + amount +
                ", expenseType='" + expenseType + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
