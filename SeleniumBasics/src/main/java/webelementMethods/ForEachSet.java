package webelementMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForEachSet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://formy-project.herokuapp.com/switch-window");
		driver.manage().window().maximize();
		WebElement openNewTabBtn=driver.findElement(By.xpath("//button[@id='new-tab-button']"));
		openNewTabBtn.click();
		//WebElement newTab=driver.findElement(By.xpath("//h1[@class='display-3']"));
		//System.out.println(newTab.getText());
		String ParentWindow=driver.getWindowHandle();//current window tab id
		System.out.println(ParentWindow);
		
		/*Set<String> windowHandles=driver.getWindowHandles();
		System.out.println(windowHandles.size());//no of open tab
		for(String window :windowHandles)
			if(!ParentWindow.equals(window)) {
				driver.switchTo().window(window);
				break;
			}
		WebElement newTab=driver.findElement(By.xpath("//h1[@class='display-3']"));
		System.out.println(newTab.getText());
		driver.close();
		driver.switchTo().window(ParentWindow);//switch to parent window*/
	}
	//iterate window--switch--titile if condo--loop break//swith tab title

}
