package PZN_06KotlinUnitTest.`04MengguakanAssertions`

import PZN_06KotlinUnitTest.Calculator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class CalculatorTest {

    private val calculator = Calculator()

    @Test
    fun testAddSuccess() {
        val result = calculator.add(10, 10)
        assertEquals(20, result, "Hasilnya harusnya 20")
    }

    @Test
    fun testAddSuccess2() {
        val result = calculator.add(10, 20)
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
            //pangging function yang menyebabkan exception
            calculator.divide(100,0)
        }
    }

}