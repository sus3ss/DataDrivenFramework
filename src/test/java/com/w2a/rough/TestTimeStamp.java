package com.w2a.rough;

import java.util.Date;

public class TestTimeStamp {

	public static void main(String[] args) {


		Date d= new Date();
		String screenshotName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		System.out.println(screenshotName);
		System.out.println(d);
		System.out.println("hello");
		System.out.println("I AM FINE12345");
   
	}
	

}
