package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathew\\Documents\\Obsqura\\Driver File\\chromedriver.exe");//set the file path of chrome driver/ communicate with which driver
		WebDriver driver= new ChromeDriver();
		driver.navigate().to(" https://selenium.qabible.in/radio-button-demo.php");
		
		WebElement MaleBtn=driver.findElement(By.xpath("(//input[@name='inlineRadioOptions'])[1]"));
		WebElement FemaleBtn=driver.findElement(By.xpath("(//input[@name='inlineRadioOptions'])[2]"));
		
		boolean maleBtnStatus=MaleBtn.isSelected();
		boolean femaleBtnStatus=FemaleBtn.isSelected();
		//not clicked
		if(maleBtnStatus==false) {
			System.out.println("Male button is not selected");
		}
		if(maleBtnStatus==true) {
			System.out.println("Male button is selected");
		}
		//clicked
		MaleBtn.click();
		boolean maleBtnClicked=MaleBtn.isSelected();
		if(maleBtnClicked==true) {
			System.out.println("Male button is selected");
		}
		if(maleBtnClicked==false) {
			System.out.println("Male button is not selected");
		}
		
		//check status of female button
		if(femaleBtnStatus==true) {
			System.out.println("Female button is selected");
		}
		if(femaleBtnStatus==false) {
			System.out.println("Female button is not selected");
		}
		

	}

}
