
package com.mycompany.framedemo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameDemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://chercher.tech/practice/frames"); // в гугле поиск сайта chercher frame
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        driver.switchTo().frame(driver.findElement(By.id("frame1"))); //сначала входим во Фрейм
        WebElement vvod = driver.findElement(By.xpath("//body//input")); // затем в элемент Фрейма
        vvod.sendKeys("zagolovok temy");//все работает!
        
        driver.switchTo().frame(driver.findElement(By.id("frame3")));
        driver.findElement(By.xpath("//input[@id='a']")).click();  // кликнули на галочку в чек боксе!
    
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame(); //выходим из фреймов 3 и 1
        driver.switchTo().frame(driver.findElement(By.id("frame2")));
        
        WebElement spisok = driver.findElement(By.xpath("//select[@id='animals']")); // вошли в дроп дан меню
        new Select(spisok).selectByVisibleText("Big Baby Cat"); // выбрали из дроп дауна
    }
}