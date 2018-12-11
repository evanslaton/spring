package com.evanslaton.spring;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldControllerTest {

    @Test
    public void testCapitalizedString() {
        assertEquals("This should be capitalized", "THIS SHOULD BE CAPITALIZED", HelloWorldController.capitalizeString("this should be capitalized"));
        assertEquals("This should be ABCDEFGHIJKLMNOPQRSTUVWXYZ", "ABCDEFGHIJKLMNOPQRSTUVWXYZ", HelloWorldController.capitalizeString("abcdefghijklmnopqrstuvwxyz"));
        assertEquals("This should be The quick brown fox jumps over the lazy dog", "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", HelloWorldController.capitalizeString("The quick brown fox jumps over the lazy dog"));
    }
}