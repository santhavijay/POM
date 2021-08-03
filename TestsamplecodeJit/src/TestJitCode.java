
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestJitCode {
@Test	
public void testLogin()
{
	System.setProperty("webdriver.chrome.driver",
			"E:\\seleumium_class\\00-Softwares\\chromedriver_92\\chromedriver.exe");
	
//WebDriver driver = new FirefoxDriver();
//WebDriver driver = new InternetExplorerDriver();
	

	WebDriver driver = new ChromeDriver();
	ChromeOptions obj = new ChromeOptions();
	driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?");
	obj.addArguments("--start-maximized");
	WebElement userName =driver.findElement(By.xpath("//*[@id='ctl00_MainContent_username']"));
	userName.sendKeys("Tester");
	WebElement password = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_password']"));
	password.sendKeys("test");
	WebElement submit = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_login_button']"));
	submit.click();
	
	System.out.println("Login successful");
}
}
