package keyboardAndmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions actions =new Actions(driver);
		//WebElement Source=driver.findElement(By.xpath("(//a[@class='button button-orange'])[1]"));
		//WebElement destination=driver.findElement(By.xpath("(//div[@id='shoppingCart4'])[1]"));
		//source to be dragged
				WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
				//destination for the dragged element
				WebElement destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
				actions.dragAndDrop(source, destination).build().perform();

	}

}
