package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://Users//asmza//IdeaProjects//JavaSilinium//driver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https:swisnl.github.io/jQuery-contextMenu/demo.html");
        Actions action = new Actions(driver);
        driver.findElement(By.xpath(""))


    }
}
