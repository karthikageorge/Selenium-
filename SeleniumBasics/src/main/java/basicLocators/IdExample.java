package basicLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		//id
		WebElement emailField=driver.findElement(By.id("email"));//syntax of id to find web element
		emailField.click();
		emailField.sendKeys("karthika");//method to send keys in input tag
		
		//name
		WebElement passwordField=driver.findElement(By.name("pass"));
		passwordField.sendKeys("password");
		
		//class name
		WebElement Loginbtn=driver.findElement(By.className("42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"));
		Loginbtn.click();
		
		//Xpath
		
		WebElement xpathpassword=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		xpathpassword.click();
		//contains with text
		//tagName[contains(text(),'Visible text')]
		//span[contains(text(),'Update location')]
		//a[contains(text(),'Forgotten password?')]
		
		//contains with attribute
		//tagName[contains(@attribute,'value')]
		//a[contains(@href,'https://www.facebook.com/recover/initiate/?')]
		WebElement containspassword=driver.findElement(By.xpath("//a[text()=//a[contains(@href,'https://www.facebook.com/recover/initiate/?')]]"));
		containspassword.click();
		//startswith
		//tagName[starts-with(@attribute,'value')]
		//a[starts-with(@text(),'Forgot')]
		//a[starts-with(@id,'u_0')]
		
	}

}
