import java.math.BigDecimal;

public class BankAccount {
    private long accountNumber;
    private BigDecimal balance;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal credit(double addSum) {
        balance = balance.add(BigDecimal.valueOf(addSum));
        return balance;
    }

    public BigDecimal debit(double substractSum) {
        if (balance.subtract(BigDecimal.valueOf(substractSum)).compareTo(BigDecimal.valueOf(0)) < 0) {
            System.out.println("You don't have enough money for the operation.");
        } else {
            balance = balance.subtract(BigDecimal.valueOf(substractSum));
        }
        return balance;
    }

    BankAccount() {
    }

    BankAccount(long accountNumber, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String toString() {
        return "Мой аккаунт: номер: " +
                this.accountNumber + ", баланс: " +
                this.balance;
    }


}
