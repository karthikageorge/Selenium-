package basicLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		//XPATH
				//syntax-//tagName[@attribute='attribute value']
				WebElement searchTxt=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
				searchTxt.sendKeys("phone");
				//parent-child
				//span[@id='nav-search-submit-text']//input[@class='nav-input nav-progressive-attribute']
				//WebElement searchTxt=driver.findElement(By.xpath("//span[@id='nav-search-submit-text']//input[@class='nav-input nav-progressive-attribute']));
				//(//input[@class='nav-input nav-progressive-attribute'])[2]-- using index
	}

}
