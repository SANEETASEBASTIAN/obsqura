package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XpathRelative extends BaseClass {

	public void xpathMethods() {
		// xpath
		WebElement elementxpath = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement elementxpath1 = driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement elementxpath2 = driver.findElement(By.xpath("//input[@id='value-b']"));
		WebElement elementxpath3 = driver.findElement(By.xpath("//button[@id='button-two']"));
		WebElement elementxpath4 = driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement elementxpath5 = driver.findElement(By.xpath("//label[@for='inputEmail4']"));

		// xpath contains
		WebElement elementxpathcontains = driver.findElement(By.xpath("//input[contains(@id,'single-input-fiel')]"));
		WebElement elementxpathcontains1 = driver.findElement(By.xpath("//button[contains(@id,'button-o')]"));
		WebElement elementxpathcontains2 = driver.findElement(By.xpath("//button[contains(@id,'button-t')]"));
		WebElement elementxpathcontains3 = driver.findElement(By.xpath("//div[contains(@id,'message-o')]"));
		WebElement elementxpathcontains4 = driver.findElement(By.xpath("/div[contains(@id,'message-t')]"));
		
		//xpath text
		WebElement elementxpathtext = driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement elementxpathtext1 = driver.findElement(By.xpath("//button[text()='Get Total']"));
		WebElement elementxpathtext2 = driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
		WebElement elementxpathtext3 = driver.findElement(By.xpath("//button[text()='Get Results']"));
		
		
		
		//xpath and
		WebElement elementxpathand= driver.findElement(By.xpath("//input[@id='single-input-field' and @class='form-control']"));
		WebElement elementxpathand1= driver.findElement(By.xpath("//input[@id='value-a' and @class='form-control']"));
		WebElement elementxpathand2= driver.findElement(By.xpath("//input[@id='value-b' and @class='form-control']"));
		WebElement elementxpathand3= driver.findElement(By.xpath("//input[@id='gridCheck'  and @class='form-check-input']"));
		
		//xpath or 
		WebElement elementxpathor= driver.findElement(By.xpath("//input[@class='form-check-input' or @id='gridCheck']"));
		WebElement elementxpathor1= driver.findElement(By.xpath("//button[@class='navbar-toggler' or @data-toggle='collapse']"));
		WebElement elementxpathor2= driver.findElement(By.xpath("//input[@type ='button' or @id='button-two']"));
		
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}