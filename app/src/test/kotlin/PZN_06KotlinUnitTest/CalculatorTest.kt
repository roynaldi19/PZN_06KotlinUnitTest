package PZN_06KotlinUnitTest

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.opentest4j.TestAbortedException

@DisplayName("Test for Calculator")
class CalculatorTest {

    companion object {
        @BeforeAll
        @JvmStatic
        fun beforeAll(){
            println("Sebelum semua unit test")
        }

        @AfterAll
        @JvmStatic
        fun afterAll(){
            println("Setelah semua unit test")
        }
    }

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
    @Disabled("Dimatikan test ini")
    fun testAddSuccessComingSoon() {
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

    @Test
    fun testAborted() {
        val profile = System.getenv()["PROFILE"]
        if ("DEV" != profile) {
            throw TestAbortedException()
        }
        println("Test Not Aborted because Dev Profile")
    }

}