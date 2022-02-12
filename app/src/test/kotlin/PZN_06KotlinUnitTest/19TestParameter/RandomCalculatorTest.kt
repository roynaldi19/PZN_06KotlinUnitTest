package PZN_06KotlinUnitTest.`19TestParameter`

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import java.util.*


class RandomCalculatorTest : ParentCalculatorTest() {

    @DisplayName("Test Calculator whit Parameter")
    @ParameterizedTest(name = "{displayName} whit data {0}")
    @ValueSource(ints = [10, 20, 30, 40, 50])
    fun testWhitParameter(value: Int){
        val result = calculator.add(value, value)
        assertEquals(value + value, result)
        println(result)

    }

    @Test
    fun testRandom(random: Random) {
        val first = random.nextInt(1000)
        println(first)
        val second = random.nextInt(1000)
        println(second)

        val result = calculator.add(first, second)
        println(result)
        assertEquals(first + second, result)

    }

    @DisplayName("Test calculator random")
    @RepeatedTest(
        value = 10,
        name = "{displayName} ke {currentRepetition} dari {totalRepetitions}"
    )
    fun testRandomRepeated(random: Random) {
        val first = random.nextInt(1000)
        println(first)
        val second = random.nextInt(1000)
        println(second)

        val result = calculator.add(first, second)
        println(result)
        assertEquals(first + second, result)
    }

}