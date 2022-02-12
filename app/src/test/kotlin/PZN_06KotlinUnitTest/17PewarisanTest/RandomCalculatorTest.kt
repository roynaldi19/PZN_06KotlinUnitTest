package PZN_06KotlinUnitTest.`17PewarisanTest`

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.util.*


class RandomCalculatorTest : ParentCalculatorTest() {

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