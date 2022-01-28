package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CreateNewFile {

	static void createFileUsingFileClass() throws IOException
	{
		File file=new File("D:\\Sonam Data\\filedemo\\testfile.txt");
		
		//create the file
		if(file.createNewFile())
			System.out.println("File is created");
		else
			System.out.println("File already Exist");
		
		//write data to file
		
		FileWriter writer=new FileWriter(file);
		writer.write("Welcome to File Handling");
		writer.close();
	}
	//create file using FileOutputStreamClass
	static void createFileUsingOutputStream() throws IOException
	{
		FileOutputStream out=new FileOutputStream("D:\\Sonam Data\\filedemo\\testfile1.txt");
		String data="Welcome to the world of JAVA File handling";
		out.write(data.getBytes());
		out.close();
	}
	//create file using NIO
	static void createFileUsingNIO() throws IOException{
		String data="Message";
		Files.write(Paths.get("D:\\Sonam Data\\filedemo\\testfile2.txt"), 
				data.getBytes(), StandardOpenOption.CREATE);
		List<String> lines=Arrays.asList("This is my first line","this is my second line");
		Files.write(Paths.get("D:\\Sonam Data\\filedemo\\testfile2.txt"), 
				lines, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
	}
	public static void main(String[] args) {
		try {
			//createFileUsingFileClass();
			//createFileUsingOutputStream();
			createFileUsingNIO();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
