package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccessMethod extends BaseClass{
	public void accessMethod() {
		//parent accessmethod
		WebElement elementname=driver.findElement(By.xpath("//input[@id='value-a']//parent: :div"));
		WebElement elementname1=driver.findElement(By.xpath("//input[@id='single-input-field']//parent : : div"));
		
	//child accessmethod
		WebElement elementname2=driver.findElement(By.xpath("//button[@type='button']//child: :span"));
		WebElement elementname3=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child: :ul"));
	}
}

