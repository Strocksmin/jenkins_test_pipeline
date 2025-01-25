import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThirdTest {
    
    @Test
    @Tag("InternalInteracting")
    void testConditions() {
        assertEquals(5 + 3, 8);
    }

    @Test
    @Tag("InternalInteracting")
    void testConditions2() {
        assertEquals(1 + 3, 4);
    }
}
