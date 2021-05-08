package newSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandling {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C://Users//asmza//IdeaProjects//JavaSilinium//driver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
      //  driver.get("https://demoqa.com/browser-windows");
        driver.get("https://demoqa.com/browser-windows");
        String currentWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//button[@id='windowButton']")).click();
        Set<String> newWindow = driver.getWindowHandles();
        Iterator<String> iterator =newWindow.iterator();
        while (iterator.hasNext()){
            String abc =iterator.next();
            if(!currentWindow.equalsIgnoreCase(abc)){
                driver.switchTo().window(abc);
                System.out.println(driver.findElement(By.xpath("//*[@id=/'sampleHeading']")).getText());

            }
        }





    }
}
