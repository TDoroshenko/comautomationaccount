public class BankAccount {
    private long accountNumber;
    private double balance;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double credit(double addSum) {
        balance = balance + addSum;
        return balance;
    }

    public double debit(double substractSum) {
        if (substractSum > balance) System.out.println("Сумма снятия больше чем остаток на счету!");
        balance = balance - substractSum;
        return balance;
    }

    BankAccount () {}

    BankAccount (long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String toString() {
        return "Мой аккаунт: номер: " +
                this.accountNumber + ", баланс: " +
                this.balance;
    }





}
