package com.demo.types;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("JUnit 5 Nested Test")
@RunWith(JUnitPlatform.class)
public class DynamicTests {
	
	@TestFactory
    Collection<DynamicTest> dynamicTests() {
        return Arrays.asList(
            dynamicTest("simple dynamic test", () -> assertTrue(true)),
            dynamicTest("Exception Executable", () -> assertFalse(false)),
            dynamicTest("simple dynamic test-2", () -> assertTrue(true)),
            dynamicTest("My Executable Class", new MyExecutable() ),
            dynamicTest("Throw exception",()->{throw new RuntimeException("Error Occured");})
            
        );
    }

}
class MyExecutable implements Executable
{

	@Override
	public void execute() throws Throwable {
		System.out.println("Test");
	}
	
}
