package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/social-icon.html");
		WebElement MailTooltip=driver.findElement(By.xpath("(//a[@target='_top'])[2]"));
		String mail=MailTooltip.getAttribute("title");
		String link=MailTooltip.getAttribute("href");//attribute value
		System.out.println(MailTooltip.getTagName());//tag name
		System.out.println(mail);
		System.out.println(link);
	}

}
