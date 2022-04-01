package TDD;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    @BeforeEach
    void setUp() {
        System.out.println("Start of test:");
    }

    @AfterEach
    void tearDown() {
        System.out.println("End of test.");
    }

    @Test
    @DisplayName("Passwords shorter than 6 characters should throw an exception")
    public void testPasswordLength() {
        PasswordChecker.passwordLength("hesjan");
    }

    @Test
    @DisplayName("First character in password must be a capital letter")
    public void testFirstChar() {
        PasswordChecker.passwordFirstCharUpperCase("Hejsan");
    }

}