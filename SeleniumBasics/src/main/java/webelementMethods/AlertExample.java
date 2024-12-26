package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement Btn1=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		Btn1.click();
		driver.switchTo().alert().accept();//alret click ok
		
		WebElement Btn2=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		Btn2.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		WebElement Btn3=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		Btn3.click();
		driver.switchTo().alert().sendKeys("hello");
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();//cancel alert
		
		//.sendkeys-->accept*/


	}

}
