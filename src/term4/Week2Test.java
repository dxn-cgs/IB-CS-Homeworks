package term4;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class Week2Test {
    @Test
    void closestToTest() {
        int[] arr = {5, 2, 2, 3, 4};
        assertEquals(0, Week2.closestTo(arr, 4.7));
        assertEquals(3, Week2.closestTo(arr, 3.5));
        assertEquals(1, Week2.closestTo(arr, 2.5));
    }

    @Test
    void standardDeviationTest() {
        int[] arr = {18, 25, 5, 48, 2, 21, 31, 17, 27, 7};
        assertEquals(13.0801, Week2.standardDeviation(arr), 1e-5);
    }
}
