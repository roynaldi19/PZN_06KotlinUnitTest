package PZN_06KotlinUnitTest.`19TestParameter`

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import java.util.*


class ParameterCalculatorTest : ParentCalculatorTest() {

    @DisplayName("Test Calculator whit Parameter")
    @ParameterizedTest(name = "{displayName} whit data {0}")
    @ValueSource(ints = [10, 20, 30, 40, 50])
    fun testWhitParameter(value: Int){
        val result = calculator.add(value, value)
        assertEquals(value + value, result)
        println(result)

    }

}