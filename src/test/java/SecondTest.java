import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SecondTest {

    @Test
    @Tag("InternalInteracting")
    void testConditions() {
        assertEquals(1, 1);
    }

    @Test
    @Tag("InternalInteracting")
    void testConditionsFailed() {
        assertEquals(1, 111);
    }
}
