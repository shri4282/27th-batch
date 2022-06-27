package Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot 
{

	public  static void takeScreenShot(WebDriver driver,String name) throws IOException {
		String d = screenshot.date();
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("E:\\New folder\\screenshot"+ name + d+ ".jpg");
		
		FileHandler.copy(source, destination);
	}
	
	public static String date() {
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
		LocalDateTime currentTime = LocalDateTime.now();
		String d = dtf.format(currentTime);
		return d;
	}

}
