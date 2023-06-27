package PZN_06KotlinUnitTest.Mock.repository

import PZN_06KotlinUnitTest.Mock.model.Person

interface PersonRepository {

    fun selectById(id: String): Person?

    fun insert(person: Person)

}