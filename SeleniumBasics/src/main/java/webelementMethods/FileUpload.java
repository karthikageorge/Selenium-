package webelementMethods;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		WebElement filebtn=driver.findElement(By.xpath("//input[@id='file-upload']"));
		String path="C:\\Users\\mathew\\Documents\\Obsqura\\Selenium\\Assignments\\Alert.java";
		//filebtn.sendKeys(path);//first method
		File file=new File(path);//2nd method
		filebtn.sendKeys(file.getAbsolutePath());
	}

}
