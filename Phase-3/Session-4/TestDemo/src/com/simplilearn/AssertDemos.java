package com.simplilearn;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
class AssertDemos {

	@Test
	void testAssert()
	{
		String str=null;
		String str2="some value";
		
		assertNull(str);
		assertNotNull(str2);
		
		assertTrue(4>0);
		assertFalse(8>9);
		
		assertSame(str, str);
		assertNotSame(str, str2);
		
		assertEquals(5, 2+3);
		assertNotEquals(5, 3+3);
		
		String a[]= {"A","B"};
		String b[]= {"A","B"};
		assertArrayEquals(a, b);
		
		assertThrows(RuntimeException.class, ()->{throw new RuntimeException();});
		
		
	}


}
