package keyboardAndmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseCursour {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions action =new Actions(driver);
		WebElement login=driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute'][1]"));
		action.moveToElement(login).build().perform();
		//mte webelmt mouse cur place
		//action.click().build().perform();//method overloading
		//2 click with paramater and withot parameter of clicl()
		action.click(login).build().perform();

	}

}
