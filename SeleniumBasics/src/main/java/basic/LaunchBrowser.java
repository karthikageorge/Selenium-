package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();//run time polymorphism
		//browser commands
			driver.get("https://www.amazon.in/");//get command
			driver.manage().window().maximize();
			String title=driver.getTitle();
			System.out.println(title);
			String url=driver.getCurrentUrl();
			System.out.println(url);
			//driver.quit();//terminate browser
			driver.close();//close only the tab

	}

}
