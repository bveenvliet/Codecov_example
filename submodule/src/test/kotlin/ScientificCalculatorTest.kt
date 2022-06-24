import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ScientificCalculatorTest {

    @Test
    fun testSquareRoot() {
        val result = ScientificCalculator().squareRoot(64.0)
        val expected = 8.0
        assertEquals(expected, result)
    }

    @Test
    fun testCubeRoot() {
        val result = ScientificCalculator().cubeRoot(64.0)
        val expected = 4.0
        assertEquals(expected, result)
    }

}