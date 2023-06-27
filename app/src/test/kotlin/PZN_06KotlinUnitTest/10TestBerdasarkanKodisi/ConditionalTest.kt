package PZN_06KotlinUnitTest.`10TestBerdasarkanKodisi`

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.condition.*

class ConditionalTest {

    @Test
    @EnabledOnOs(value = [OS.WINDOWS])
    fun enableOnWindows(){

    }

    @Test
    @DisabledOnOs(value = [OS.LINUX, OS.MAC])
    fun disableOnLinuxOrMac(){

    }

    @Test
    @EnabledOnJre(value = [JRE.JAVA_8])
    fun enableOnJava8(){

    }

    @Test
    @DisabledOnJre(value = [JRE.JAVA_8])
    fun disableOnJava8(){

    }

}