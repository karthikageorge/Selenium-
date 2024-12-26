package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;	//casting. Explicit type conversion
		//js.executeScript("alert('karthika')");
		js.executeScript("window.scrollBy(0,600)"); //xana y bottom to up coordinae
		js.executeScript("window.scrollBy(0,0)");
		//until element reach
		WebElement backtotop=driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']"));
		js.executeScript("arguments[0].scrollIntoView();", backtotop);
		//click on button not happen sometimes..using js we can click
		WebElement hrefclick=driver.findElement(By.xpath("//a[text()='Amazon Pay on Merchants']"));
		js.executeScript("arguments[0].click();",hrefclick);
		//keybord interaction
	}
}
