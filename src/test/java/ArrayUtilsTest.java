import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for ArrayUtils with 100% branch coverage including countOf.
 */
public class ArrayUtilsTest {

    // ==================== findMin ====================

    @Test
    public void testFindMinNormalArray() {
        assertEquals(1, ArrayUtils.findMin(new int[]{3, 1, 4, 1, 5}));
    }

    @Test
    public void testFindMinSingleElement() {
        assertEquals(7, ArrayUtils.findMin(new int[]{7}));
    }

    @Test
    public void testFindMinNullThrows() {
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.findMin(null));
    }

    @Test
    public void testFindMinEmptyThrows() {
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.findMin(new int[]{}));
    }

    @Test
    public void testFindMinAlreadySorted() {
        assertEquals(1, ArrayUtils.findMin(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testFindMinDescending() {
        assertEquals(1, ArrayUtils.findMin(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    public void testFindMinNegatives() {
        assertEquals(-10, ArrayUtils.findMin(new int[]{-1, -5, -10, -3}));
    }

    // ==================== findMax ====================

    @Test
    public void testFindMaxNormalArray() {
        assertEquals(5, ArrayUtils.findMax(new int[]{3, 1, 4, 1, 5}));
    }

    @Test
    public void testFindMaxSingleElement() {
        assertEquals(7, ArrayUtils.findMax(new int[]{7}));
    }

    @Test
    public void testFindMaxNullThrows() {
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.findMax(null));
    }

    @Test
    public void testFindMaxEmptyThrows() {
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.findMax(new int[]{}));
    }

    @Test
    public void testFindMaxNegatives() {
        assertEquals(-1, ArrayUtils.findMax(new int[]{-1, -5, -10, -3}));
    }

    // ==================== sum ====================

    @Test
    public void testSumNormalArray() {
        assertEquals(15, ArrayUtils.sum(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testSumSingleElement() {
        assertEquals(10, ArrayUtils.sum(new int[]{10}));
    }

    @Test
    public void testSumNullThrows() {
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.sum(null));
    }

    @Test
    public void testSumEmptyThrows() {
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.sum(new int[]{}));
    }

    // ==================== average ====================

    @Test
    public void testAverageNormalArray() {
        assertEquals(3.0, ArrayUtils.average(new int[]{1, 2, 3, 4, 5}), 0.001);
    }

    @Test
    public void testAverageSingleElement() {
        assertEquals(10.0, ArrayUtils.average(new int[]{10}), 0.001);
    }

    @Test
    public void testAverageNullThrows() {
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.average(null));
    }

    @Test
    public void testAverageEmptyThrows() {
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.average(new int[]{}));
    }

    @Test
    public void testAverageWithRemainder() {
        assertEquals(2.5, ArrayUtils.average(new int[]{1, 2, 3, 4}), 0.001);
    }

    // ==================== contains ====================

    @Test
    public void testContainsFound() {
        assertTrue(ArrayUtils.contains(new int[]{1, 2, 3}, 2));
    }

    @Test
    public void testContainsNotFound() {
        assertFalse(ArrayUtils.contains(new int[]{1, 2, 3}, 5));
    }

    @Test
    public void testContainsEmptyArray() {
        assertFalse(ArrayUtils.contains(new int[]{}, 1));
    }

    @Test
    public void testContainsNullThrows() {
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.contains(null, 1));
    }

    // ==================== indexOf ====================

    @Test
    public void testIndexOfFound() {
        assertEquals(1, ArrayUtils.indexOf(new int[]{10, 20, 30}, 20));
    }

    @Test
    public void testIndexOfNotFound() {
        assertEquals(-1, ArrayUtils.indexOf(new int[]{10, 20, 30}, 50));
    }

    @Test
    public void testIndexOfEmptyArray() {
        assertEquals(-1, ArrayUtils.indexOf(new int[]{}, 1));
    }

    @Test
    public void testIndexOfNullThrows() {
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.indexOf(null, 1));
    }

    @Test
    public void testIndexOfFirstOccurrence() {
        assertEquals(0, ArrayUtils.indexOf(new int[]{5, 5, 5}, 5));
    }

    // ==================== countOf ====================

    @Test
    public void testCountOfMultipleOccurrences() {
        assertEquals(3, ArrayUtils.countOf(new int[]{1, 2, 1, 3, 1}, 1));
    }

    @Test
    public void testCountOfNoOccurrences() {
        assertEquals(0, ArrayUtils.countOf(new int[]{1, 2, 3}, 5));
    }

    @Test
    public void testCountOfSingleOccurrence() {
        assertEquals(1, ArrayUtils.countOf(new int[]{1, 2, 3}, 2));
    }

    @Test
    public void testCountOfEmptyArray() {
        assertEquals(0, ArrayUtils.countOf(new int[]{}, 1));
    }

    @Test
    public void testCountOfAllSame() {
        assertEquals(4, ArrayUtils.countOf(new int[]{7, 7, 7, 7}, 7));
    }
}
