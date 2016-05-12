package free_hugs.stories;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by anna on 09.05.16.
 */


public class TestClass {

    public WebDriver driver = new FirefoxDriver();

    @Test
    public void openVkPage(){
        driver.navigate().to("https:vk.com/");
        driver.findElement(By.xpath(".//*[@name='email']")).sendKeys("");
        driver.findElement(By.xpath(".//*[@id='quick_pass']")).sendKeys("");
        driver.findElement(By.xpath(".//*[@id='quick_login_button']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//input[@id='ts_input']")));
    }

}
