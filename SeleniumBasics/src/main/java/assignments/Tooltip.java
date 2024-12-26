package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/window-popup.php");
		WebElement faceBookBtn =driver.findElement(By.xpath("//a[text()='  Like us On Facebook ']"));
		WebElement followAllBtn=driver.findElement(By.xpath("//a[@id='windowMulti']"));
		String btn=faceBookBtn.getAttribute("title");
		System.out.println(btn);
		
		String btn2=followAllBtn.getAttribute("title");
		System.out.println(btn2);
	}

}
