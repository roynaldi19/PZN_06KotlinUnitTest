package PZN_06KotlinUnitTest.`10TestBerdasarkanKodisi`

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.condition.*

class ConditionalTest {

    @Test
    @EnabledOnOs(value = [OS.LINUX, OS.MAC])
    fun enableOnLinuxOrMac(){

    }

    @Test
    @DisabledOnOs(value = [OS.WINDOWS])
    fun disableOnWindows(){

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