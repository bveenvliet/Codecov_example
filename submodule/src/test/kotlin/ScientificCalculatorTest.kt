import com.example.submodule.ScientificCalculator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class ScientificCalculatorTest {

    private lateinit var scientificCalculator: ScientificCalculator

    @BeforeEach
    fun setUp() {
        scientificCalculator = ScientificCalculator()
    }

    @Test
    fun testSquareRoot() {
        val result = scientificCalculator.squareRoot(64.0)
        val expected = 8.8
        assertEquals(expected, result)
    }

    @Test
    fun testCubeRoot() {
        val result = scientificCalculator.cubeRoot(64.0)
        val expected = 4.0
        assertEquals(expected, result)
    }

}