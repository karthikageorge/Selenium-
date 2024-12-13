package basicLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		//linktext
		WebElement forgotpassword=driver.findElement(By.linkText("Forgotten password?"));
		forgotpassword.click();
		//partiallinktext
		WebElement partiallink=driver.findElement(By.partialLinkText("Forgotten"));
		forgotpassword.click();
		//important
		//XPATH
		//syntax-tagName[@attribute='attribute value']
		WebElement searchTxt=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchTxt.sendKeys("phone");
		

	}

}
