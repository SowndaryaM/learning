import org.openqa.selenium.chrome.ChromeDriver;

public class Demoautomationofjava {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}

}
