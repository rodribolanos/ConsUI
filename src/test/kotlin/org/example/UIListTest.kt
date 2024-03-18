package org.example

import junit.framework.TestCase.assertEquals
import org.junit.Test
import kotlin.test.assertFalse

class UIListTest {

    val list = listOf(1, 2, 3);
    val list2 = listOf(2,3,4,1)

    @Test
    fun testIsSorted() {
        assert(UIList.isSorted(list))
        assertFalse { UIList.isSorted(list2) }
    }

    @Test
    fun testOrderDescending() {
        assertEquals(listOf(3,2,1), UIList.ordenar(false, list))
    }

    @Test
    fun testOrder() {
        assertEquals(listOf(1,2,3,4), UIList.ordenar(true, list2))
    }

    @Test
    fun filterPrimes() {
        assertEquals(listOf(2,3), UIList.filterPrimes(list));
        assertEquals(listOf(2,3), UIList.filterPrimes(list2));
    }

    @Test
    fun powMap() {
        assertEquals(listOf(4.0,8.0,16.0,2.0), UIList.powMap(list2));
    }

    @Test
    fun sumProdPos() {
        assertEquals(24, UIList.sumProdPos(list2))
    }
}