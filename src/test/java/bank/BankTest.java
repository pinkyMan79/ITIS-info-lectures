package bank;

import one.terenin.practice.bank.entity.Bank;
import one.terenin.practice.bank.service.BankService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankTest {

    private BankService bankService;
    private Bank bank;

    @BeforeEach
    public void setUp() {
        // set up vars here
    }

    @Test
    public void initialTest() {
        Assertions.assertNotNull(bankService);
        Assertions.assertNotNull(bank);
    }

    // more tests (5-7 will be enough i think)

}
