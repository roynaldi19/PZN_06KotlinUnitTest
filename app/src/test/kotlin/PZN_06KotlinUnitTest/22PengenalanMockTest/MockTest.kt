package PZN_06KotlinUnitTest.`22PengenalanMockTest`

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.Mockito

class MockTest {

    @Test
    fun testMock() {

        val list: List<String> = Mockito.mock(List::class.java) as List<String>

        Mockito.`when`(list[0]).thenReturn("Roy")
        Mockito.`when`(list[1]).thenReturn("Naldi")

        assertEquals("Roy", list[0])
        assertEquals("Naldi", list[1])

        Mockito.verify(list)[0]
        Mockito.verify(list)[1]
    }
}