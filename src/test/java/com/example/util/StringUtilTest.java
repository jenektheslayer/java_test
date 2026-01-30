package com.example.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StringUtilTest {
    @Test
    public void reverseLetters_shouldReturnString_ifContainsOnlyLetters() {
        String str = StringUtil.reverseLetters("String");
        assertEquals("gnirtS", str);
    }
    @Test
    public void reverseLetters_shouldReturnEmpty_ifContainsNothing() {
        String str = StringUtil.reverseLetters("");
        assertEquals(null, str);
    }
    @Test
    public void reverseLetters_shouldReturnStringAndNumbers() {
        String str = StringUtil.reverseLetters("1a2b3");
        assertEquals("1b2a3", str);
    }
    @Test
    public void reverseLetters_shouldReturnNull() {
        String str = StringUtil.reverseLetters(null);
        assertNull(str);
    }
    @Test
    public void reverseLetters_shouldReturnString_ifContainsSpace() {
        String str = StringUtil.reverseLetters("a b c d e f g");
        assertEquals("g f e d c b a",str);
    }
    @Test
    public void reverseLetters_shouldReturnNumbers_ifContainsOnlyNumbers() {
        String str = StringUtil.reverseLetters("123");
        assertEquals("123",str);
    }

}


