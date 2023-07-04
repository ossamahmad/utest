import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class triangleTest {

    @Test
    void area() throws Exception {
        assertEquals(5, triangle.area(2,5));
        assertThrows(Exception.class, () -> triangle.area(-2, 5));
        assertThrows(Exception.class, () -> triangle.area(2, -5));
    }
}