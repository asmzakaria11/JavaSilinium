package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.xml.ws.Action;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C://Users//asmza//IdeaProjects//JavaSilinium//driver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https:jqueryui.com/droppable/");
        driver.switchTo().frame(0);

        WebElement web= driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement large= driver.findElement(By.xpath("//div[@id='droppable']"));
        Thread.sleep(3000);
        Actions action = new Actions(driver);
        action.clickAndHold(web).moveToElement(large).release().build().perform();


    }
}
