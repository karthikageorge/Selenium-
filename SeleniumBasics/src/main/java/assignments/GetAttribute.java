package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/file-download.php");
		WebElement fileDownload=driver.findElement(By.xpath("//a[text()='File Download']"));
		WebElement generateFileBtn=driver.findElement(By.xpath("//button[@id='create']"));
		WebElement textAreaField=driver.findElement(By.xpath("//textarea[@rows='5']"));
		String file=fileDownload.getAttribute("href");
		System.out.println(file);
		
		String fileBtn=generateFileBtn.getAttribute("disabled");
		System.out.println(fileBtn);
		
		String text=textAreaField.getAttribute("id");
		System.out.println(text);
		
		
		
		

	}

}
