import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CalculatorTest {

    @Test
    fun testAdd() {
        val result = Calculator().add(2, 3)
        val expected = 5
        assertEquals(expected, result)
    }

    @Test
    fun testSubtract() {
        val result = Calculator().subtract(2, 3)
        val expected = -1
        assertEquals(expected, result)
    }

    @Test
    fun testMultiply() {
        val result = Calculator().multiply(2, 3)
        val expected = 6
        assertEquals(expected, result)
    }

    @Test
    fun testDivide() {
        val result = Calculator().divide(6, 3)
        val expected = 2
        assertEquals(expected, result)
    }
}