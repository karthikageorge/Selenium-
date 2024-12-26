package webelementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		WebElement Alldropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		List<WebElement> menuItems=driver.findElements(By.xpath("//select[@id='searchDropdownBox']//option"));
		Select select=new Select(Alldropdown);//constructor,parameterized -->webelement type, aggregatiion
		//select dropdown from select tagname must be select then only we can use  select class
		select.selectByIndex(3);//4th option--index based
		select.selectByValue("search-alias=aps");//attribute value 
		select.selectByVisibleText("Amazon Pharmacy");//select by visible text
		//select.getOptions();

	}

}
