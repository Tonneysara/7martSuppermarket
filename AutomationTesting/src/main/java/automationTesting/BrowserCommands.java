package automationTesting;

public class BrowserCommands extends Base{

	public void browserCommands() {
		// for getting the title of the current page.
		String title= driver.getTitle();
		System.out.println(title);
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}
	public static void main(String[] args) {
		
		BrowserCommands browser = new BrowserCommands();
		browser.browserInitialization();
		browser.browserCommands();
	}

}
