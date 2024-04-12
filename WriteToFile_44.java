package com.web.java;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile_44 {

	
	  public static void main(String[] args) {
	        try
	        {
	            FileWriter f=new FileWriter ("C:\\Users\\ramya\\OneDrive\\Desktop\\test. txt");
	            try
	            {
	            f. write("Java programming is the best language ");
	             }
	    finally
	    {
	        f. close();
	        
	    }
	    System. out. println("Successfully data wrote in file");
	    
	    }
	    catch(IOException ex) 
	    {
	        System. out. println(ex);
	    }
	}
	}

