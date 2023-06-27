package PZN_06KotlinUnitTest.`05MengubahNamaTest`

import PZN_06KotlinUnitTest.Calculator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

@DisplayName("Test for Calculator")
class CalculatorTest {

    private val calculator = Calculator()

    @Test
    @DisplayName("Test for Function Add")
    fun testAddSuccess() {
        val result = calculator.add(10, 10)
        assertEquals(20, result, "Hasilnya harusnya 20")
    }

}