package sample;

import org.openqa.selenium.firefox.FirefoxDriver;

public class First {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
	}

}
