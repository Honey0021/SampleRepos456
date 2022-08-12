package Test1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class amazon {
	
	@Test
	public void function1(){
		
        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.amazon.in/";

		driver.get(url);

		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		action.moveToElement(ele).perform();

		driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//a")).click();


	}

}
