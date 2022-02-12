package PZN_06KotlinUnitTest.`19TestParameter`

import PZN_06KotlinUnitTest.Calculator
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.extension.Extensions

@Extensions(value = [
    ExtendWith(RandomParameterResolver::class)
])

abstract class ParentCalculatorTest {

    val calculator = Calculator()

    fun beforeEach(){
        println("Before Each")
    }

}