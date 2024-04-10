package seleniumProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;
	public void initialiseBrowser() {
		driver= new ChromeDriver();//object create to web driver:loading driver
		driver.get("https://selenium.qabible.in/");//launching the url
		driver.manage().window().maximize();// maximize the window
		

	}
public void driverQuit() {
	driver.close();// close the window :close the current window
	//driver.quit();//quit the all  windows open
}
public  static void main(String args[]) {
	BaseClass b=new BaseClass();
	b.initialiseBrowser();
	b.driverQuit();
}
}
