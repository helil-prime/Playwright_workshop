package playground;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightFirstTest {
	
	public static void main(String[] args) {
		// first of all, create a playwright object
		Playwright playwright = Playwright.create();
		// then create a browser object
		Browser browser = playwright.chromium()
				.launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
		// then create a page object - page object is basically interacts with any content of a web page
		Page page = browser.newPage();
		
		page.navigate("http://amazon.com");
		System.out.println(page.title()); 
		System.out.println(page.url()); 
		
		page.getByText("Sign in securely").click();
		
		// example of css locator
		page.locator("#ap_email").fill("dummy@primetechschool.com");
		
		// example of xpath locator
		//page.locator("//input[@name='email']").fill("dummy@primetechschool.com");
		
		// example of getByLable locator
		//page.getByLabel("Email or mobile phone number").fill("dummy@primetechschool.com");
		
		//page.close();
		//playwright.close();
	}

}
