package PZN_06KotlinUnitTest.`03MembuatTest`

import PZN_06KotlinUnitTest.Calculator
import org.junit.jupiter.api.Test

class CalculatorTest {

    val calculator = Calculator()

    @Test
    fun testAddSuccess() {
        val result = calculator.add(10, 10)

    }

    @Test
    fun testAddSuccess2() {
        val result = calculator.add(10, 20)

    }

}