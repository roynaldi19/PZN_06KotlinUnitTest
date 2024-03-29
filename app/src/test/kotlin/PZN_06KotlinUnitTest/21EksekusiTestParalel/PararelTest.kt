package PZN_06KotlinUnitTest.`21EksekusiTestParalel`

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Timeout
import org.junit.jupiter.api.parallel.Execution
import org.junit.jupiter.api.parallel.ExecutionMode
import java.util.concurrent.TimeUnit

@Execution(ExecutionMode.CONCURRENT)
class ParallelTest () {

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    fun testSlow1() {
        Thread.sleep(3_000)
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    fun testSlow2() {
        Thread.sleep(3_000)
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    fun testSlow3() {
        Thread.sleep(3_000)
    }
}

