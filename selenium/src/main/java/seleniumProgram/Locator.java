package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locator extends BaseClass { 
	public void locatorMethod() {
		// WebElement elementname=driver.findElement(By.Locator("locator value"));

		// ID
		WebElement elementid = driver.findElement(By.id("single-input-field"));
		WebElement elementid1 = driver.findElement(By.id("value-b"));
		WebElement elementid2 = driver.findElement(By.id("value-a"));
		WebElement elementid3 = driver.findElement(By.id("button-two"));

		// CLASS
		WebElement elementclass = driver.findElement(By.className("clearfix"));
		WebElement elementclass1 = driver.findElement(By.className("btn btn-primary"));
		WebElement elementclass2 = driver.findElement(By.className("header-top"));
		WebElement elementclass3 = driver.findElement(By.className("mb-sec"));
		WebElement elementclass4 = driver.findElement(By.className("navbar-brand"));

		// NAME
		WebElement elementname = driver.findElement(By.name("viewport"));

		// LINKTEXT
		WebElement elementText = driver.findElement(By.linkText("Simple Form Demo"));
		WebElement elementText1 = driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement elementText2 = driver.findElement(By.linkText("Select Input"));
		WebElement elementText3 = driver.findElement(By.linkText(" Ajax Form Submit"));
		WebElement elementText4 = driver.findElement(By.linkText("Jquery Select2"));

		// PARTIAL LINK TEXT
		WebElement elementPartialText = driver.findElement(By.partialLinkText("Simple Form "));
		WebElement elelementPartialText1 = driver.findElement(By.partialLinkText("Checkbox"));
		WebElement elementPartialText2 = driver.findElement(By.partialLinkText("Select "));
		WebElement elementPartialText3 = driver.findElement(By.partialLinkText(" Ajax Form"));
		WebElement elementPartialText4 = driver.findElement(By.partialLinkText("Jquery "));

		// CSS SELECTOR-ID
		WebElement elementCssSelector = driver.findElement(By.cssSelector("button#button-one"));
		WebElement elementCssSelector1 = driver.findElement(By.cssSelector("input#value-a"));
		WebElement elementCssSelector2 = driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement elementCssSelector3 = driver.findElement(By.cssSelector("input#check-box-one"));
		
		//CLASS
		WebElement elementCssSelectorclass = driver.findElement(By.cssSelector("input.form-check-input"));
		WebElement elementCssSelectorclass1 = driver.findElement(By.cssSelector("div.headr-top"));
		WebElement elementCssSelectorclass2 = driver.findElement(By.cssSelector("div.card-body"));

		// TAG AND ATTRIBUTE
		WebElement elementTag = driver.findElement(By.cssSelector("div[class='header-top']"));
		WebElement elementTag1 = driver.findElement(By.cssSelector("div[class='mb-sec']"));
		WebElement elementTag2 = driver.findElement(By.cssSelector("section[class='clearfix']"));
		WebElement elementTag3 = driver.findElement(By.cssSelector("button[class='navbar-toggler']"));
		WebElement elementTag4 = driver.findElement(By.cssSelector("footer[class='mt-5']"));

		//TAG,ATTRIBUTE,CLASS
		WebElement elementTag5 = driver.findElement(By.cssSelector("button.navbar-toggler[type=button]"));
		WebElement elementTag6 = driver.findElement(By.cssSelector("button.navbar-toggler[data-toggle=collapse]"));
		WebElement elementTag7 = driver.findElement(By.cssSelector("div.my-2[id=message-one]"));
		WebElement elementTag8 = driver.findElement(By.cssSelector("select.form-control[id=single-input-field]"));
		WebElement elementTag9 = driver.findElement(By.cssSelector("label.form-check-label[for=inlineRadio1]"));
	}

	public static void main(String args[]) {

		Locator l = new Locator();
		l.initialiseBrowser();

		l.locatorMethod();
		l.driverQuit();
	}
}
