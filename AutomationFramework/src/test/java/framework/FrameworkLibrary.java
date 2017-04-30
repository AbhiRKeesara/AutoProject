package framework;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;

public class FrameworkLibrary {

	public static ChromeDriver chromeDriver ;
	
	public static void intiateChomeBrowser(){
		
		File chromeDriverPath = new File(
				"chromeDriver/chromedriver.exe");
				System.setProperty("webdriver.chrome.driver",
				chromeDriverPath.getAbsolutePath());
	}
	
	
}
