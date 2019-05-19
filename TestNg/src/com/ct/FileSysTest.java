package com.ct;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileSysTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      
	  Properties ps = new Properties();	
	  FileInputStream fs = new FileInputStream("./data.properties");
	  ps.load(fs);
	  System.out.println(ps.get("loginButton"));
	 //driver.findElement(By.xpath(ps.get(loginButton)))
	}

}
