package PZN_06KotlinUnitTest.`08MembatalkanTest`

import PZN_06KotlinUnitTest.Calculator
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.opentest4j.TestAbortedException

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
    fun testAborted() {
        val profile = System.getenv()["PROFILE"]
        if ("DEV" != profile) {
            throw TestAbortedException()
        }
        println("Test Not Aborted because Dev Profile")
    }

}

