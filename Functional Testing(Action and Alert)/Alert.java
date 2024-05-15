package functionalAutomation;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Alert extends BaseTest {

	@Test
	public void verifyRightClickTest() throws Exception {
        WebElement rightclick = driver.findElement(By.xpath("//span[contains(text(),'right')]"));
        WebElement Delete_ele= driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
        
        Actions act = new Actions(driver);

        act.contextClick(rightclick).perform();
        act.click(Delete_ele).perform();
        
        Thread.sleep(3000);
        
        System.out.println("Alert Text: "+driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        
        System.out.println("Application Title: " + driver.getTitle()); 
    }
    
	@Test
    public void verifyDoubleClickTest() throws Exception {

        WebElement doubleclick= driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
        Actions act = new Actions(driver);
        

        act.doubleClick(doubleclick).perform();
        
        Thread.sleep(3000);
        
        System.out.println("Alert Text: "+driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        
        
        System.out.println("Application Title: " + driver.getTitle());
    }

}
