import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CheckNameToEmbrossTest {
    @Test
    public void CheckNameToEmbrossCorrectTest() {
        Account account = new Account("Ivan Petrov");
        boolean actual = account.checkNameToEmboss();
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void minQuantityNegativeTest() {
        Account account = new Account("I v");
        boolean actual = account.checkNameToEmboss();
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void maxQuantityNegativeTest() {
        Account account = new Account("Iddddddddddd vddddddddddddddd");
        boolean actual = account.checkNameToEmboss();
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void startWithSpaceNegativeTest() {
        Account account = new Account(" Ivan Petrov");
        boolean actual = account.checkNameToEmboss();
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void endWithSpaceNegativeTest() {
        Account account = new Account("Ivan Petrov ");
        boolean actual = account.checkNameToEmboss();
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void containsSpaceNegativeTest() {
        Account account = new Account("IvanPetrov");
        boolean actual = account.checkNameToEmboss();
        boolean expected = false;
        assertEquals(expected, actual);
    }

}
