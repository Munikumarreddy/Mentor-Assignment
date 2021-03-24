package com.cognizant;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment7 {
	public static void main(String[] args) {
	    try {
	      File myObj = new File("filename.txt");
	      if (myObj.createNewFile()) {
	        System.out.println("File created: " + myObj.getName());
	      } else {
	        System.out.println("File already exists.");
	      }
	      List<String>al=new ArrayList<String>();
	      al.add("cts");
	      al.add("vidhyadhar");
	      FileWriter fw=new FileWriter("filename.txt");
	      
	      for(int i=0;i<al.size();i++)
	      {
	    	  fw.write(al.get(i));
	      }
	      System.out.println("Successfully writed data");
	     
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }
}