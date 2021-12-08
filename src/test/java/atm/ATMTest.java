package atm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
    private ATM atm;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        atm = new ATM();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void processNormal() {
        atm.process(35);
        assertEquals("Please receive 1 of 5\nPlease receive 1 of 10\nPlease receive 1 of 20",
                outputStreamCaptor.toString().trim());
    }

    @Test
    void processError() {
        assertThrows(IllegalArgumentException.class, () -> {atm.process(357);});
    }
}