package js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pinterest {


     @Test
     public void Login(){
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://www.pinterest.com/");
        WebElement button = driver.findElement(By.xpath("//div[contains(text(),'Войти')]"));
        button.click();

        driver.findElement(By.id("email")).sendKeys("tatyana.areshko@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Test123");
        WebElement button2 = driver.findElement(By.cssSelector("button.red.SignupButton.active"));

        js.executeScript("arguments[0].click();", button2);
        js.executeScript("alert('Hello, Tatyana!')");
        driver.close();
    }

}
