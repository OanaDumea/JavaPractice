import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountTest {


    @Test
    public void creditScoreTooLowTest(){
        Customer c1 = new Customer("Oana", 30, 0.4);
        Account a1 = new Account(c1);
        Assertions.assertEquals(1.00, a1.getInterest());

    }
}
