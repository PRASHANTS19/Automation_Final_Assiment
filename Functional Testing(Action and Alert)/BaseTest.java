package functionalAutomation;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {
	
	WebDriver driver;
	@Before
	public void setup() throws Exception {
		
		driver = new ChromeDriver();
//		driver = new EdgeDriver();
//        driver.get("https://www.amazon.in/");
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        
        driver.manage().window().maximize();
	}
	
	@After
	public void close() {
		 driver.close();
	     driver.quit();
	}

}
