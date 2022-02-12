package PZN_06KotlinUnitTest.repository

import PZN_06KotlinUnitTest.model.Person

interface PersonRepository {

    fun selectById(id: String): Person?

    fun insert(person: Person)

}