package keyboardAndmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Actions actions =new Actions(driver);
		WebElement btn1=driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement btn2=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		//right click
		//actions.contextClick().build().perform();//normal right click withot parameter
		actions.contextClick(btn1).build().perform();
		actions.doubleClick().build().perform();
		actions.doubleClick(btn2).build().perform();
		


	}

}
