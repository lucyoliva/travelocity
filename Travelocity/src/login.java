
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("hello");
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\lucy\\Downloads\\chromedriver_win32\\chromedriver.exe");

	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("email")).sendKeys("minnujose86@yahoo.co.in");
	driver.findElement(By.name("pass")).sendKeys("xxxxxx");
	driver.findElement(By.name("pass")).sendKeys(Keys.ENTER);
	

	WebElement element;


	}
	public void display()
	{
		System.out.println("hello");
	}

}
