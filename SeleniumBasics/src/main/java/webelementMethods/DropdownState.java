package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownState {

	public static void main(String[] args) {
		String state="Hawaii";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/jquery-select.php");
		WebElement Alldropdownclick=driver.findElement(By.xpath("(//span[@class='select2-selection select2-selection--single'])[1]"));
		Alldropdownclick.click();
		WebElement Alldropdown=driver.findElement(By.xpath("//input[@type='search']"));
		//Alldropdown.sendKeys("California");
		Alldropdown.sendKeys(state);
		WebElement Alldropdownselect=driver.findElement(By.xpath("//li[contains(text(),'"+state+"')]"));
		Alldropdownselect.click();//--tochange we use concatenation
		
		
		
		//li tag inte webelement
	//Alldropdownselect get options

	}

}
