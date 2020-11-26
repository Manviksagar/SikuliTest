package com.sag.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WithoutDriver {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
         Screen screen= new Screen();
		
		Pattern search = new Pattern("C:\\Users\\SAGAR\\work\\AutoProject\\src\\test\\resources\\images\\GooglePage\\search.PNG");
		Pattern btn = new Pattern("C:\\Users\\SAGAR\\work\\AutoProject\\src\\test\\resources\\images\\GooglePage\\searchbtn.PNG");
		
		screen.type(search,"Allu vidyasagar");
		
		screen.click(btn);


	}

}
