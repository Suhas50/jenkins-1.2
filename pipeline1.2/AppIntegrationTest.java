
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppIntegrationTest {
    @Test
    void testApplicationCalculation() {
        int result = App.add(10, 20);
        assertEquals(30, result);
    }
}
