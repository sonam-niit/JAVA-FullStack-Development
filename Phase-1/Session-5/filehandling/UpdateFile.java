package com.simplilearn.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateFile {

	public static void modifyfile(String filename,String oldString,String newString)
	{
		File fileToModify= new File(filename);
		String oldContent="";
		BufferedReader reader=null;
		FileWriter writer=null;
		try
		{
			reader=new BufferedReader(new FileReader(fileToModify));
			String line=reader.readLine();
			while(line !=null)
			{
				oldContent=oldContent+line+System.lineSeparator();
				line=reader.readLine();
			}
			
			String newContent=oldContent.replaceAll(oldString, newString);
			
			writer=new FileWriter(fileToModify);
			writer.write(newContent);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
			reader.close();
			writer.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		modifyfile("D:\\Sonam Data\\filedemo\\testfile2.txt", "line", "text");
		System.out.println("File Modified Successfully");
	}
}
