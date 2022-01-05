package PZN_06KotlinUnitTest

class Calculator {

    fun add(first: Int, second: Int): Int {
        return first + second
    }

    fun divide(first: Int, second: Int): Int {
        if(second == 0){
            throw IllegalArgumentException("Tidak bisa di bagi 0")
        } else {
            return first / second
        }

    }
}