package seleniumProgram;

public class NavigateCommands extends BaseClass{
public void navigateBrowser() {
	driver.navigate().to("https://www.amazon.in/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigateCommands nb=new NavigateCommands();
		nb.initialiseBrowser();
		nb.navigateBrowser();
		nb.driverQuit();
				
				
				
				
				
				
				
				
				

	}

}
