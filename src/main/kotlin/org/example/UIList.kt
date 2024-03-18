package org.example

import java.lang.Math.pow

object UIList {
    fun isSorted(lista: List<Int>): Boolean {
        for (i in 0 until lista.size - 1) {
            if (lista[i] > lista[i + 1]) {
                return false
            }
        }
        return true
    }

    fun ordenar(asc: Boolean, lista: List<Int>): List<Int> {
        if (asc) {
            return lista.sorted()
        } else {
            return lista.sortedDescending();
        }
    }

    fun isPrimo(numero: Int): Boolean {
        if (numero <= 1) {return false};
        var num = 2;
        while (num != numero) {
            if (numero % num == 0) {
                return false;
            }
            num++;
        }
        return true
    }

    fun filterPrimes(lista: List<Int>): List<Int> {
        return lista.filter { i -> this.isPrimo(i) };
    }

    fun powMap(lista: List<Int>): List<Double> {
        return lista.map { num -> pow(2.0, num.toDouble()) }
    }

    fun sumProdPos(lista: List<Int>): Int {
        return lista.map { num -> num* (lista.indexOf(num) + 1) }.sum();
    }
}