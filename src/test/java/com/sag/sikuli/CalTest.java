package com.sag.sikuli;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class CalTest {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub
		Screen screen= new Screen();
		
		Pattern digit8 = new Pattern("C:\\Users\\SAGAR\\work\\AutoProject\\src\\test\\resources\\images\\8.PNG");
		Pattern plus = new Pattern("C:\\Users\\SAGAR\\work\\AutoProject\\src\\test\\resources\\images\\plus.PNG");
		Pattern digit9 = new Pattern("C:\\Users\\SAGAR\\work\\AutoProject\\src\\test\\resources\\images\\9.PNG");
		Pattern equal = new Pattern("C:\\Users\\SAGAR\\work\\AutoProject\\src\\test\\resources\\images\\equal.PNG");
		
		screen.click(digit8);
		screen.click(plus);
		screen.click(digit9);
		screen.click(equal);
		
		
		

	}

}
