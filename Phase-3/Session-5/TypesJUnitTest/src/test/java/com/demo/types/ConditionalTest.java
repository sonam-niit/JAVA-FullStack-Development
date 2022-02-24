package com.demo.types;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("JUnit 5 Conditional Test")
@RunWith(JUnitPlatform.class)
public class ConditionalTest {

	@Test
	@EnabledOnOs({OS.WINDOWS})
	public void runOnWindows()
	{
		System.out.println("This runs on Windows");
	}
	@Test
	@EnabledOnOs({OS.MAC})
	public void runOnMAC()
	{
		System.out.println("This runs on MAC OS");
	}
	@Test
	@EnabledOnJre(JRE.JAVA_15)
	public void runOnlyOnJRE8()
	{
		System.out.println("Run the compatibility test only on JRE 8");
	}
	@Test
	@EnabledIfSystemProperty(named = "os.version", matches = ".*11.*")
	public void runOnlyWindows10()
	{
		System.out.println("Run only on windows 10");
	}
	@Test
	@EnabledIf("test")
	public void conditionTrue()
	{
		System.out.println("condition passed");
	}
	
	boolean test()
	{
		return (2 * 3) > 6;
	}
}
