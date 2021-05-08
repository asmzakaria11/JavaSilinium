package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

    public static void main (String [] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C://Users//asmza//IdeaProjects//JavaSilinium//driver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://instagram.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Zakaria");
        driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Zakaria123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();





    }
}
