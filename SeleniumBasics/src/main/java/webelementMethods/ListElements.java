package webelementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/");
		//ul[@class='navbar-nav']/li[3]/a
		//return list of web elements
		List<WebElement> menuItems=driver.findElements(By.xpath("//ul[@class='navbar-nav']//a"));
				//menuItems.size();
		System.out.println(menuItems.size());
		System.out.println(menuItems);
		/*for(int i=0;i<menuItems.size();i++) {
			System.out.println(menuItems.get(i).getText());
			
		}
	}*/
	for(WebElement a:menuItems) {
		System.out.println(a.getText());
		System.out.println(a.getAttribute("href"));
	}

}
}
