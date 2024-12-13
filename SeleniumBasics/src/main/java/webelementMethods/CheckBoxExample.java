package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		WebElement checkBox =driver.findElement(By.xpath("(//input[@type='checkbox'][1])"));
		WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		boolean checkBoxstatus=checkBox.isSelected();
		boolean checkBoxstatus1=checkBox2.isSelected();
		System.out.println(checkBoxstatus);
		System.out.println(checkBoxstatus1);
		if(checkBoxstatus==false) {
			checkBox.click();
		}
		if(checkBoxstatus1==false) {
			checkBox2.click();
		}
		//isDisplayed()
		System.out.println(checkBox.isDisplayed());
		//enabled()
		System.out.println(checkBox.isEnabled());
		
	}

}
