package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/window-popup.php");
		driver.manage().window().maximize();
		WebElement likeBtn=driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
		likeBtn.click();
		String parentWindow=driver.getWindowHandle();
		Set<String> windowHandles=driver.getWindowHandles();
		for(String window:windowHandles) {
			if(!parentWindow.equals(window)){
				driver.switchTo().window(window);
				//break;
				driver.manage().window().maximize();
				
			}
		}
		String childWindow=driver.getTitle();
		System.out.println(childWindow);
		
		WebElement btnText=driver.findElement(By.xpath("//span[text()='Create new account']"));
		System.out.println(btnText.getText());
		
	}

}
