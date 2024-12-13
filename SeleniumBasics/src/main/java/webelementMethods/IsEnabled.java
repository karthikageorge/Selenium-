package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://formy-project.herokuapp.com/enabled");
		driver.manage().window().maximize();
		WebElement disabledInput=driver.findElement(By.xpath("//input[@id='disabledInput']"));
		WebElement enabledInput=driver.findElement(By.xpath("//input[@id='input']"));
		System.out.println(disabledInput.isDisplayed());
		System.out.println(disabledInput.isEnabled());
		System.out.println(enabledInput.isDisplayed());
		System.out.println(enabledInput.isEnabled());
	}

}
