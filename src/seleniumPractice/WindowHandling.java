package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.Set;



public class WindowHandling {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C://Users//asmza//IdeaProjects//JavaSilinium//driver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String currentWindow = driver.getWindowHandle();
        System.out.println(driver.findElement(By.xpath("//*[@id='app']/div/div/div[1]/div")).getText());
        driver.findElement(By.xpath("//*[@id='windowButton']")).click();
        Set <String> window = driver.getWindowHandles();
      Iterator <String> abc = window.iterator();
      while (abc.hasNext()){
        String xyz = abc.next();
        if(!currentWindow.equalsIgnoreCase(xyz)){
            driver.switchTo().window(xyz);

            System.out.println(driver.findElement(By.xpath("//*[@id='sampleHeading']")).getText());

        }

      }

    }
}
