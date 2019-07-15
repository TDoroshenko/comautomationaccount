/*
Из предыдущего ДЗ: Создать класс BankAccount который будет иметь два поля
accountNumber и balance.
Реализовать в классе методы setBalance() который будет задавать баланс ,
credit() метод должен начислять средства на счет, debit() - снимать средства со  счета.
Реализовать условие что если сумма снятия больше чем остаток на счету -
вывести сообщение : “Сумма снятия больше чем остаток на счету!” .
Создать обьект класса и проверить работу программы. Покрыть код юнит тестами
 */

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1001, BigDecimal.valueOf(13.00));
        bankAccount.debit(7.00);
        bankAccount.credit(1.18);
        System.out.println(bankAccount.toString());
    }
}

