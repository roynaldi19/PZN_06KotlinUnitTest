package PZN_06KotlinUnitTest.`13SiklusHidupTest`

import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

@TestMethodOrder(value = MethodOrderer.OrderAnnotation::class)
class SiklusHidupTest {

    var counter: Int = 0
    //bukti setiap test berdiri sendiri counternya tetap 1 di test ketiga

    @Test
    @Order(2)
    fun test3(){
        counter++
        println(counter)

    }

    @Test
    @Order(3)
    fun test1(){
        counter++
        println(counter)

    }

    @Test
    @Order(1)
    fun test2(){
        counter++
        println(counter)

    }


}