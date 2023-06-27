package PZN_06KotlinUnitTest.`23MockingTest`

import PZN_06KotlinUnitTest.Mock.model.Person
import PZN_06KotlinUnitTest.Mock.repository.PersonRepository
import PZN_06KotlinUnitTest.Mock.service.PersonService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.extension.Extensions
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension

@Extensions(
    value = [
        ExtendWith(MockitoExtension::class)
    ]
)
class PersonServiceTest {

    @Mock
    lateinit var personRepository: PersonRepository

    lateinit var personService: PersonService

    @BeforeEach
    fun beforeEach() {
        personService = PersonService(personRepository)
    }

    @Test
    fun testPersonIdIsNotValid() {
        assertThrows<IllegalArgumentException> {
            personService.get("      ")
        }
    }

    @Test
    fun testPersonNotFound() {
        assertThrows<Exception> {
            personService.get("not found")
        }
    }

    @Test
    fun testGetPersonSuccess() {
        Mockito.`when`(personRepository.selectById("eko")).thenReturn(Person("eko", "Eko Kurniawan"))

        val person = personService.get("eko");
        assertEquals("eko", person.id)
        assertEquals("Eko Kurniawan", person.name)
    }

}