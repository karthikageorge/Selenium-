package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrefPrint {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/file-download.php");
		WebElement homeHref=driver.findElement(By.xpath("//a[text()='Home']"));
		WebElement tableHref=driver.findElement(By.xpath("//li[@class='nav-item']//a[contains(text(),'Table')]"));
		
		String homeLink=homeHref.getAttribute("href");
		String homeTag=homeHref.getTagName();
		System.out.println("Home href= "+homeLink +" and TagName is "+homeTag);
		String tableLink=tableHref.getAttribute("href");
		String tableTag=homeHref.getTagName();
		System.out.println("Table href= "+tableLink+" and TagName is "+tableTag);
		

	}

}
