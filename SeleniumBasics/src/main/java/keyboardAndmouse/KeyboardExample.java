package keyboardAndmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//search.sendKeys("phone"+Keys.ENTER);
		search.sendKeys("phone"+Keys.BACK_SPACE);
		//2 keys ogether
		search.sendKeys(Keys.chord(Keys.CONTROL,"A"));//
	
		
		
	}

}
