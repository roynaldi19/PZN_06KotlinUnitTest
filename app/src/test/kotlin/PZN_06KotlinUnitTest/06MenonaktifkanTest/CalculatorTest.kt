package PZN_06KotlinUnitTest.`06MenonaktifkanTest`

import PZN_06KotlinUnitTest.Calculator
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals

@DisplayName("Test for Calculator")
class CalculatorTest {

    private val calculator = Calculator()

    @Test
    @DisplayName("Test for Function Add")
    fun testAddSuccess() {
        val result = calculator.add(10, 10)
        assertEquals(20, result, "Hasilnya harusnya 20")
    }

    @Disabled("Sementara test ini di nonaktifkan untuk perbaikan")
    @Test
    fun testAddSuccess2() {
        val result = calculator.add(10, 20)
        assertEquals(20, result, "Hasilnya harusnya 20")
    }


}

