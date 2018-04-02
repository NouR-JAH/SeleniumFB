

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class FaebookRegistration {
	
	static WebDriver driver;
	
	public static void main(String[] ar) {
		
		System.setProperty("webdriver.gecko.driver" , "C:\\Users\\Admin\\Desktop\\New folder (2)\\Uni - Spring Semester of 2018\\Software\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='u_0_e']")).sendKeys("MyName");  
		Select sel = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		sel.selectByIndex(3);
		driver.findElement(By.xpath(".//*@[id='u_0_w']")).click();  
	}

}
