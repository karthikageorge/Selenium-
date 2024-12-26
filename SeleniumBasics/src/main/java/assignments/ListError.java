package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListError {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/form-submit.php");
		WebElement Button = driver.findElement(By.xpath("//button[@type='submit']"));

		List<WebElement> listError = driver.findElements(By.xpath("//div[@class='invalid-feedback']"));
		Button.click();
		for (WebElement errorMsg : listError) {
			String error = errorMsg.getText();
			System.out.println(error);
		}
	}

}
