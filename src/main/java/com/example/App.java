package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.youtube.com/");
    	driver.manage().window().maximize();
    	//driver.findElement();
    	//    	    	driver.findElement();
       // System.out.println( "Hello World!" );
    }
}
