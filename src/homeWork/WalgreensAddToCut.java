package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WalgreensAddToCut {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C://Users//asmza//IdeaProjects//JavaSilinium//driver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://walgreens.com");
        driver.findElement(By.xpath("//div[@class='dropdown dropdown__menu']")).click();

        driver.findElement(By.xpath("//li[@id='menu-shop-products']")).click();
        driver.findElement(By.cssSelector("li[id='Beauty']")).click();
        driver.findElement(By.cssSelector("li[id='Beauty-Cosmetics']")).click();
        driver.findElement(By.cssSelector("li[id='Beauty-Cosmetics-Face']")).click();
        driver.findElement(By.cssSelector("button[id='pickup-ship-btncompare_sku6198020']")).click();
        driver.findElement(By.xpath("//button[@aria-controls='PICK_IT']")).click();

































    }
}