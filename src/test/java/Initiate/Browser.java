package Initiate;

import java.io.File;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Browser {
	
	@Test
	public void Initiation() {

		File userDir = new File (System.getProperty("user.dir"));
		System.out.println("Path for Chrome Driver is : "+userDir+"\\chromedriver.exe");
		System.setProperty("driver.chrome.chromedriver", userDir+"\\chromedriver.exe");
//		APPLICATION_LOGS.debug("\n \n Executing Navigate to Alarm.com");
		System.out.println("\n \n Executing Navigate to Make My Trip Main Website");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class=\"makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"chNavIcon appendBottom2 chSprite chFlights active\"]")).click();
//		driver.findElement(By.xpath("(//*[@class=\"lbl_input latoBold  appendBottom5\"])[1]")).click();
//		driver.findElement(By.xpath("//*[@for=\"fromCity\"]")).click();
		driver.findElement(By.xpath("//*[@data-cy=\"submit\"]//a")).click();
//		driver.findElement(By.xpath("//*[@for=\"fromCity\"]//input")).sendKeys(Keys.ENTER);
		
		
	
		
	}
}
