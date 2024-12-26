package webelementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		//List<WebElement> menuItems=driver.findElements(By.xpath("//input[@class='check-box-list']"));
		List<WebElement> checkBox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		/*for(int i=1;i<=menuItems.size();i++) {
			menuItems.get(i).click();
	

	}*/
		for(WebElement checkboxes:checkBox) {
			checkboxes.click();
			
		}
	}
}
