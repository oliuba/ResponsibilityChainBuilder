package builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;

    @BeforeEach
    void setUp() {
        user = User.builder().firstName("Olha").age(18).lastName("Liuba").occupation("UCU").occupation("Singing").build();
    }

    @Test
    void testToString() {
        String expected = "User(firstName=Olha, lastName=Liuba, occupations=[UCU, Singing], gender=null, age=18, weight=0)";
        String got = user.toString();
        assertEquals(expected, got);
    }
}