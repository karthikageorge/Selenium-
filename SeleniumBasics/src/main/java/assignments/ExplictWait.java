package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWait {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/dynamic-load.php");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		WebElement getUserBtn=driver.findElement(By.xpath("//button[@id='save']"));
		wait.until(ExpectedConditions.elementToBeClickable(getUserBtn));
		getUserBtn.click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='card-body']//h5[@class='card-title']")));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[@class='card-text text-center p-3']")));
        WebElement name=driver.findElement(By.xpath("//div[@class='card-body']//h5[@class='card-title']"));
        WebElement email=driver.findElement(By.xpath("//p[@class='card-text text-center p-3']"));
        String nameinString=name.getText();
        String emailinString=email.getText();
        System.out.println(nameinString);
        System.out.println(emailinString);
	}

}
