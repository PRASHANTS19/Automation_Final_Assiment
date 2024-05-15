package functionalAutomation;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionClass{
	
	@Test
    public void verifyWishListTest() throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	    
	    WebElement SignIn = driver.findElement(By.xpath("//span[contains(text(),'Hello, sign')]"));
	    WebElement CreateWishList = driver.findElement(By.xpath("//span[contains(text(),'Create a Wish List')]"));
	    
	    Actions action = new Actions(driver);
        
	    action.moveToElement(SignIn).perform();
	    Thread.sleep(2000);
	    action.moveToElement(CreateWishList).perform();
	    action.click().perform();
    
        
      	driver.close();
	    driver.quit();
        
    }

}
