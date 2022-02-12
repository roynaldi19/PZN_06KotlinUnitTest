package PZN_06KotlinUnitTest.`14TestdalamTest`

import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.condition.*

class NestedTest {

    @Test
    fun test1(){

    }

    @Nested
    inner class MyNestedTest {


        @Test
        fun test1(){

        }
    }

}