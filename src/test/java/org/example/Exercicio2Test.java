package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio2Test {
    Exercicio2 e ;

    @BeforeEach
    public void before()
    {
        e = new Exercicio2();
    }

    @ParameterizedTest
    @ValueSource(ints = { 3, 23, 311, 487, 653, 947, 4})
    public void testIsPrime(int value )
    {
        boolean metodo = e.isPrime(value);
        assertEquals(true,metodo,"erro!");
    }

    @ParameterizedTest
    @ValueSource(ints = { 32, 64, 2, 20, 30, 26, 0, 1})
    public void testIsEven(int value)
    {
        boolean metodo = e.isEven(value);
        assertEquals(true,metodo,"erro!");
    }

    @ParameterizedTest
    @ValueSource(ints = { 23, 46, 115,24, 184, 207, 230, 19})
    public void testIsMultiple(int values)
    {
        int num2 = 23;
        boolean metodo = e.isMultiple(values, num2);
        assertEquals(true,metodo,"erro!");
    }
}