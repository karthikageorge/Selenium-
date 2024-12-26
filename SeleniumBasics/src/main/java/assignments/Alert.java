package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		WebElement alert=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		alert.click();
		driver.switchTo().alert().accept();
		WebElement alert2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		alert2.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}
