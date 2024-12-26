package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement MaleBtn=driver.findElement(By.xpath("(//input[@name='inlineRadioOptions'])[1]"));
		WebElement FemaleBtn=driver.findElement(By.xpath("(//input[@name='inlineRadioOptions'])[2]"));
		//WebElement InlineMaleBtn =driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		//WebElement InlineFemaleBtn =driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		WebElement ShowSelectedBtn=driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
		
		System.out.println(ShowSelectedBtn.isEnabled());
		System.out.println(FemaleBtn.isEnabled());
		System.out.println(MaleBtn.isEnabled());
	}

}
