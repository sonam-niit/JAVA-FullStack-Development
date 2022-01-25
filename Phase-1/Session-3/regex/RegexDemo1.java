package com.simplilearn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {

	public static void main(String[] args) {
		
		String pattern="[A-Za-z]aat";
		
		Pattern p=Pattern.compile(pattern);
		
		Matcher match= p.matcher("baat");
		
		System.out.println("Result "+match.matches());
		
	}
}
