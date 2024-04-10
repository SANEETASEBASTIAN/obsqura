package seleniumProgram;

public class BrowserCommands extends BaseClass{
public void browserCommands() {
	String title=driver.getTitle();
	//System.out.println(title);
	String url=driver.getCurrentUrl();
	//System.out.println(url);
	String pagesourse=driver.getPageSource();
	System.out.println(pagesourse);
	
	
}
	public static void main(String[] args) {
		BrowserCommands b=new BrowserCommands();
		b.initialiseBrowser();
		b.browserCommands();
        b.driverQuit();
	}

}
