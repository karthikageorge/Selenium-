package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssProperty {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/bootstrap-alert.php");
		WebElement AutoBtn=driver.findElement(By.xpath("//button[@id='autoclosable-btn-success']"));
		System.out.println(AutoBtn.getCssValue("background-color"));
		System.out.println(AutoBtn.getCssValue("color"));//font color
		System.out.println(AutoBtn.getCssValue("font-size"));
		System.out.println(AutoBtn.getCssValue("font-style"));
		int x=AutoBtn.getLocation().getX();//to check the webelement positions
		System.out.println(x);
		
		//following(top-down)
		//a[@href='index.php']//img[@alt='logo']//following::button[@id='button-one']
		
		//preceding
		//button[@id='button-one']//preceding::a[@href='index.php']//img[@alt='logo']
		
		//preceding-sibling
		//label[contains(text(),'Four')]//preceding-sibling::input[@type='checkbox']
		
		//example
		//label[@for='inputEmail4']//following::input[@id='single-input-field']
		
	}

}
