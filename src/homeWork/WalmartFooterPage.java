package homeWork;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WalmartFooterPage {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C://Users//asmza//IdeaProjects//JavaSilinium//driver//chromedriver.exe" );

        WebDriver driver = new ChromeDriver();
        driver.get("https://walmart.com");


       JavascriptExecutor scriptdown= (JavascriptExecutor) driver;
        scriptdown.executeScript("window.scrollBy(0,4000);");

      WebElement drv = driver.findElement(By.xpath("//div[@id='js-global-footer-wrapper']"));
      System.out.println(drv.getText());





    }
}
