package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssProperty {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/bootstrap-modal.php");
        WebElement launchBtn=driver.findElement(By.xpath("//div[@class='card-body']//button[@data-target='#exampleModalCenter1']"));
        System.out.println(launchBtn.getCssValue("color"));
        System.out.println("fontcolor"+launchBtn.getCssValue("font-color"));
        System.out.println(launchBtn.getCssValue("font-size"));
        System.out.println(launchBtn.getCssValue("font-style"));
	}

}
