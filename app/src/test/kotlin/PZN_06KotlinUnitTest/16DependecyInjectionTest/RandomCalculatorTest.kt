package PZN_06KotlinUnitTest.`16DependecyInjectionTest`

import PZN_06KotlinUnitTest.Calculator
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.extension.Extensions
import java.util.*

@Extensions(
    value = [
        ExtendWith(RandomParameterResolver::class)
    ]
)
class RandomCalculatorTest {

    private val calculator = Calculator()

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

}