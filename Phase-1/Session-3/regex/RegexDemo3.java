package com.simplilearn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {

	public static void main(String[] args) {
		
		String pattern="[A-Za-z0-9]{6}";
		
		Pattern p=Pattern.compile(pattern);
		
		Matcher match= p.matcher("sonam1");
		
		System.out.println("Result "+match.matches());
		//which accept 10 numbers but first digit start from 7,8,9
		
		String pattern1="[789]{1}\\d{9}";
		
		Pattern p1=Pattern.compile(pattern1);
		
		Matcher match1= p1.matcher("7022993456");
		
		if(match1.matches())
		{
			System.out.println("Mobile no is valid");
		}
		else
		{
			System.out.println("Not Valid mobile number");
		}
		
	}
}
