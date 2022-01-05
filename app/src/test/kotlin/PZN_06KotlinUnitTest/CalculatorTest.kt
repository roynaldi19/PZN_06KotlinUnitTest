package PZN_06KotlinUnitTest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class CalculatorTest {
    val calculator = Calculator()

    @Test
    fun testAddSuccess() {
        val result = calculator.add(10,10)
        assertEquals(20, result, "Hasilnya harusnya 20")
    }

    @Test
    fun testAddSuccess2() {
        val result = calculator.add(10,20)
        assertEquals(20, result, "Hasilnya harusnya 20")
    }

    @Test
    fun testDivideSuccess() {
        val result = calculator.divide(100, 10)
        assertEquals(10, result)
    }

    @Test
    fun testDivideFailed() {
        assertThrows<IllegalArgumentException> {
            calculator.divide(100,0)
        }
    }

}