package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomeWork {

    public static void main (String [] args){

        System.setProperty("webdriver.chrome.driver","C://Users//asmza//IdeaProjects//JavaSilinium//driver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[1]")).click();
        WebElement ele= driver.findElement(By.xpath("//h1[@data-g-module_id='mission-statement']"));//" print our mission"
        System.out.println(ele.getText());


    }

}
