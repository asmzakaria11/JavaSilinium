package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificColum {

    public static void main (String [] args){

        System.setProperty("webdriver.chrome.driver","C://Users//asmza//IdeaProjects//JavaSilinium//driver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://walmart.com");
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        exe.executeScript("window.scrollBy(0,4000);");

        WebElement drv =driver.findElement(By.xpath("//ul[@class='k_a ax_a']"));
        System.out.println(drv.getText());

        




    }
}
