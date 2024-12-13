package basicLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		//id
		WebElement search=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		search.sendKeys("Earbuds");
		//class
		WebElement searchtabclass=driver.findElement(By.cssSelector(".nav-input.nav-progressive-attribute"));
		search.sendKeys("iphone");
		//tag
		WebElement dropdown=driver.findElement(By.tagName("select"));
		dropdown.click();
		
		//name
		//WebElement name=driver.findElement(By.tagName("select"));
	}

}
