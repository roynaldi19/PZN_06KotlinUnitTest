package PZN_06KotlinUnitTest.`12UrutanEksekusiTest`

import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

@TestMethodOrder(value = MethodOrderer.OrderAnnotation::class)
//@TestMethodOrder(value = MethodOrderer.Alphanumeric::class)
class OrderTest {

    @Test
    @Order(2)
    fun test3(){

    }

    @Test
    @Order(3)
    fun test1(){

    }

    @Test
    @Order(1)
    fun test2(){

    }

}