package PZN_06KotlinUnitTest.`09MenggunakanAssumptions`

import PZN_06KotlinUnitTest.Calculator
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.opentest4j.TestAbortedException
import org.junit.jupiter.api.Assumptions.*

@DisplayName("Test for Calculator")
class CalculatorTest {

    private val calculator = Calculator()

    @Test
    @DisplayName("Test for Function Add")
    fun testAddSuccess() {
        val result = calculator.add(10, 10)
        assertEquals(20, result, "Hasilnya harusnya 20")
    }


    @Test
    fun testAssumption() {
        assumeTrue("DEV" == System.getenv()["PROFILE"])
        println("Test Not Aborted because Dev Profile")

    }

}

