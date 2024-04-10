package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends BaseClass {
	public void findElement() {
		WebElement elementinput=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		elementinput.click();
	 	
	 WebElement elementMessage=driver.findElement(By.id("single-input-field"));
		elementMessage.sendKeys("Hello");
		System.out.println(elementMessage);
		
		WebElement button=driver.findElement(By.id("button-one"));
		button.click();
		
		WebElement elementEntervalue=driver.findElement(By.id("value-a"));
	
		elementEntervalue.sendKeys("10");
		System.out.println(elementEntervalue);
		
		WebElement elementvalue=driver.findElement(By.id("value-b"));
		elementvalue.sendKeys("10");
		System.out.println(elementvalue);
		
		WebElement Totalbutton=driver.findElement(By.id("button-two"));
		Totalbutton.click();
		
		
		
		
		
		WebElement elementname=driver.findElement(By.xpath("//a[@href='check-box-demo.php']"));	
		elementname.click(); 
				
				
				
				
				
				
				
				
				
				
				
				
				//a[@href='check-box-demo.php']
		
		
		
		
	}
public static void main(String args[]) {
	WebElementCommands we=new WebElementCommands();
	we.initialiseBrowser();
	we.findElement();
	//we.driverQuit();
	
	
}
}