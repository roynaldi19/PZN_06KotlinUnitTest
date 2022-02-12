package PZN_06KotlinUnitTest.`07SebelumSetelahTest`

import PZN_06KotlinUnitTest.Calculator
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals

@DisplayName("Test for Calculator")
class CalculatorTest {

    private val calculator = Calculator()

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

