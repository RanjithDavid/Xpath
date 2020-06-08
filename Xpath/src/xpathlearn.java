import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class xpathlearn {
	//To write and check Xpath in Chrome
	//Press F12 to open Chrome Developer Tool
	//In "Elements" panel, press Ctrl+F
	@Test
	public void OrangeHRM() {
		WebDriver driver = new FirefoxDriver();//ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
		driver.quit();
	}
}
