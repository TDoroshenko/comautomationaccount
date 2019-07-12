public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1001, 10.3);
        bankAccount.debit(15.0);
        bankAccount.credit(1.1);
        System.out.println(bankAccount.toString());
    }
}
