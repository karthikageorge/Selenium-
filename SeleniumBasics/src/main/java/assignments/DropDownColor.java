package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownColor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		WebElement listColor=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(listColor);
		//select.selectByVisibleText("Selected Color : Red");
		//select.selectByValue("message-one");
		select.selectByIndex(1);
		//WebElement selectColor=driver.findElement(By.xpath("//div[@id='message-one']"));
		
	}

}
