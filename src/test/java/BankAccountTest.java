import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class BankAccountTest {
    private BankAccount testBankAccount = new BankAccount(0, BigDecimal.valueOf(1.0));

    @Test
    void creditTest() {
        double addSum = 9.00;
        BigDecimal expectedResult = BigDecimal.valueOf(10.0);
        BigDecimal actualResult = testBankAccount.credit(addSum);
        Assert.assertEquals("If fail then method credit() is broken.", actualResult, expectedResult);
    }

    @Test
    void debitNegativeTest() {
        double substractSum = 99.99;
        BigDecimal expectedResult = BigDecimal.valueOf(1.0);
        BigDecimal actualResult = testBankAccount.debit(substractSum);
        Assert.assertEquals("If fail the method debit() is broken.", actualResult, expectedResult);
    }

    @Test
    void debitPositiveTest() {
        double substractSum = 0.99;
        BigDecimal expectedResult = BigDecimal.valueOf(0.01);
        BigDecimal actualResult = testBankAccount.debit(substractSum);
        Assert.assertEquals("If fail the method debit() is broken.", actualResult, expectedResult);
    }

    @Test
    void toStringTest() {
        String expectedResult = "Мой аккаунт: номер: 0, баланс: 1.0";
        String actualresult = testBankAccount.toString();
        Assert.assertEquals("If fail the method toString() is broken.", actualresult, expectedResult);
    }
}