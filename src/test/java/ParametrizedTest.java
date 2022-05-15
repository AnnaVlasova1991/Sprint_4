import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class) // добавили раннер Parameterized
public class ParametrizedTest {
    private final String name;
    private final boolean expected;

    public ParametrizedTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getName() {
        return new Object[][] {
                {"Ivan Petrov", true},
                {"I v", false},
                {"Iddddddddddd vddddddddddddddd", false},
                {" Ivan Petrov", false},
                {"Ivan Petrov ", false},
                {"IvanPetrov", false},
                {"I ", false},
                {"Idredfedfr rfrddddd", false},
                {"Idredfedfr rfrdddddg", false},
                {" ", false},
                {null, false},
        };
    }

    @Test
    public void CheckNameToEmbrossTest() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expected, actual);
    }
}
