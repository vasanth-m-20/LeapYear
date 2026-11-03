package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testLeapYears() {
        assertTrue(Main.isLeapYear(2024));
        assertTrue(Main.isLeapYear(2020));
    }

    @Test
    public void testNonLeapYears() {
        assertFalse(Main.isLeapYear(2023));
        assertFalse(Main.isLeapYear(2021));
    }

    @Test
    public void testCenturyYears() {
        assertTrue(Main.isLeapYear(2000));
        assertFalse(Main.isLeapYear(1900));
        assertFalse(Main.isLeapYear(2100));
    }
}