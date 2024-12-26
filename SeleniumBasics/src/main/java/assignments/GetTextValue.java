package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
        WebElement Header=driver.findElement(By.xpath("//div[contains(text(),'Radio Button Demo')]"));
        WebElement ShowSelectedBtn=driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
        WebElement FemaleRadioBtn=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
        WebElement Message=driver.findElement(By.xpath("//div[@id='message-one']"));
       
        FemaleRadioBtn.click();
        ShowSelectedBtn.click();
        String Msg=Message.getText();
        System.out.println("Result ="+Msg);
        
        String headerName=Header.getText();
        System.out.println("Header Name is "+headerName);
        
        String BtnName=ShowSelectedBtn.getText();
        System.out.println("Button Name is "+BtnName);
       
        
	}

}
