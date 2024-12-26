package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReturnAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement ShowSelectedBtn=driver.findElement(By.xpath("//button[@id='button-one']"));
		//return a attribute value
		String BtnAttribute1=ShowSelectedBtn.getAttribute("value");
		String BtnAttribute=ShowSelectedBtn.getAttribute("id");
		System.out.println(BtnAttribute);
		
		
	}

}
