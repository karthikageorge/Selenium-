package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBackgroundColor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/bootstrap-alert.php");
		List<WebElement> color=driver.findElements(By.xpath("//div[@class='card-body']/div/div/button"));
		for(WebElement backGroundcolors:color) {
			System.out.println("Backgroud color is "+backGroundcolors.getCssValue("background-color"));
			System.out.println("TagName "+backGroundcolors.getTagName());
		}
	

	}

}
