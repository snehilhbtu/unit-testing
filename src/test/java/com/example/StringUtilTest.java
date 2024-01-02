package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.StringUtil;

public class StringUtilTest {
	@Test
	public void testReverseString() {
	    assertEquals("tac", StringUtil.reverseString("cat"));
	    assertEquals("god", StringUtil.reverseString("dog"));
	    assertEquals("", StringUtil.reverseString(""));
	    assertThrows(IllegalArgumentException.class, () -> StringUtil.reverseString(null));
	}

	@Test
	public void testIsPalindrome() {
	    assertTrue(StringUtil.isPalindrome("madam"));
	    assertTrue(StringUtil.isPalindrome("racecar"));
	    assertFalse(StringUtil.isPalindrome("hello"));
	    assertTrue(StringUtil.isPalindrome(""));
	    assertThrows(IllegalArgumentException.class, () -> StringUtil.isPalindrome(null));
	}

	@Test
	public void testConcatenateStrings() {
	    assertEquals("HelloWorld", StringUtil.concatenateStrings("Hello", "World"));
	    assertEquals("", StringUtil.concatenateStrings("", ""));
	    assertThrows(IllegalArgumentException.class, () -> StringUtil.concatenateStrings(null, "World"));
	    assertThrows(IllegalArgumentException.class, () -> StringUtil.concatenateStrings("Hello", null));
	    assertThrows(IllegalArgumentException.class, () -> StringUtil.concatenateStrings(null, null));
	}

	@Test
	public void testCountOccurrences() {
	    assertEquals(2, StringUtil.countOccurrences("hello", 'l'));
	    assertEquals(0, StringUtil.countOccurrences("world", 'z'));
	    assertEquals(2, StringUtil.countOccurrences("programming", 'm'));
	    assertEquals(0, StringUtil.countOccurrences("", 'a'));
	    assertThrows(IllegalArgumentException.class, () -> StringUtil.countOccurrences(null, 'a'));
	}

}
