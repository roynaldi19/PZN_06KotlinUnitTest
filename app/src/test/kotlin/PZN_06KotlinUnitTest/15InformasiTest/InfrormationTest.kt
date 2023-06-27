package PZN_06KotlinUnitTest.`15InformasiTest`

import org.junit.jupiter.api.*

@DisplayName("Test whit Test Info")
class InformationTest {

    @Test
    @Tags(value = [
        Tag("contoh1"),
        Tag("contoh2"),
    ])
    @DisplayName("sample Test")
    fun sampleTest(testInfo: TestInfo){
        println(testInfo.displayName)
        println(testInfo.tags)
        println(testInfo.testClass)
        println(testInfo.testMethod)
    }

}