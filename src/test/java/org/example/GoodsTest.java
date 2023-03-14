package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodsTest {

    @Test
    void testGetName() {
        Goods good1 = new Goods();
        good1.setName("Предикат");
        assertEquals("Предикат", good1.getName());
    }

    @Test
    void testGetQuantity() {
        Goods good2 = new Goods();
        good2.setQuantity(2);
        assertEquals(2, good2.getQuantity());
    }

    @Test
    void testGetAmount() {
        Goods good3 = new Goods();
        good3.setAmount(2.4);
        assertEquals(2.4, good3.getAmount());
    }

    @Test
    void testSetName() {
        Goods good4 = new Goods();
        good4.setName("Предикат");
        good4.setName("Предикат2");
        assertEquals("Предикат2", good4.getName());
    }

    @Test
    void testSetQuantity() {
        Goods good5 = new Goods();
        good5.setQuantity(1);
        good5.setQuantity(2);
        assertEquals(2, good5.getQuantity());
    }

    @Test
    void testSetAmount() {
        Goods good6 = new Goods();
        good6.setAmount(9.0);
        good6.setAmount(1.9);
        assertEquals(1.9, good6.getAmount());
    }
}