package newSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;

public class Project1 {

    public static void main (String [] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://Users//asmza//IdeaProjects//JavaSilinium//driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://bankofamerica.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='onlineId1']")).sendKeys("Zakaria");
        driver.findElement(By.xpath("//input[@id='nav-search-query']")).sendKeys("Afm");
        driver.findElement(By.xpath("//head=['data-oet-data']")).sendKeys("Zakir");
        driver.findElement(By.xpath("//body[@data-sparta-version='5.0.1']")).sendKeys("Zakaria");




    }
}
