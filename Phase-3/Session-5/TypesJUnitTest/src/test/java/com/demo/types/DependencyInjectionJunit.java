package com.demo.types;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("JUnit 5 Nested Test")
@RunWith(JUnitPlatform.class)
public class DependencyInjectionJunit {

	@Test
	@DisplayName("Test1")
	@Tag("my-tag")
	void test1(TestInfo testInfo)
	{
		assertEquals("Test1", testInfo.getDisplayName());
		assertTrue(testInfo.getTags().contains("my-tag"));
	}
}
