package nyuad.se.cs.bank;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import nyuad.cs.se.bank.BankAccount;

class BankAccountTest {
    BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(100.0);
    }

    @Test
    void testSuccessDeposit() {
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

}