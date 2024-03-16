package org.example

import org.junit.Test
import kotlin.test.assertEquals

class StrTest {
    @Test
    fun pruebaReversa(){
        val result = Str.revert("hola")
        assert(result == "aloh")
    }

    @Test
    fun pruebaPalindromoFalse(){
        val result = Str.isPalindrome("persistencia")
        assert(result == false)
    }

    @Test
    fun pruebaPalindromoTrue(){
        val result = Str.isPalindrome("neuquen")
        assert(result == true)
    }

    @Test
    fun pruebaContadorVocales(){
        val result = Str.vowels("ácido clorhídrico")
        assert(result == 7)
    }

    @Test
    fun pruebaContadorPalabras(){
        val result = Str.words("Hola, cómo estás?")
        assertEquals(result, 3)
    }
}