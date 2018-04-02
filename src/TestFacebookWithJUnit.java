import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFacebookWithJUnit {

	static WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.gecko.driver" , "C:\\Users\\Admin\\Desktop\\New folder (2)\\Uni - Spring Semester of 2018\\Software\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@After
	public void tearDown() throws Exception {
		
		//driver.quit();
	}
	
	@Test
	public void test() {
		
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("abd.shanaa@hotmail.com");		
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("dodo123456789*");
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();


		
	}
	
}
