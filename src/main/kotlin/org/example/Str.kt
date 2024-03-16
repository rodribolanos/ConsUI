package org.example

object Str {
    fun revert(input: String): String {
        return input.reversed()
    }
    fun isPalindrome(word: String): Boolean {
        val reversedWord = word.reversed()
        return word == reversedWord
    }
    fun vowels(input: String): Int {
        val vowels = "aeiouAEIOUáéíóúÁÉÍÓÚ"
        var count = 0
        for (char in input) {
            if (char in vowels) {
                count++
            }
        }
        return count
    }

    fun words(sentence: String): Int {
        var palabras = 0;
        if (!sentence.isBlank()) {
            palabras = 1;
            for (i in sentence) {
                palabras = palabras + unoSi(i == ' ')
            }
        }
        return palabras
    }

    fun unoSi(condicion: Boolean): Int = if (condicion) 1 else 0;
}