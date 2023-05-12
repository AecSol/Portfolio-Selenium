
package com.mycompany.waitingdemo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitingDemo {

    public static void main(String[] args) {
      
        System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
        ChromeOptions options = new ChromeOptions(); //для отказа от опций
        options.addArguments("disable-notifications");//отказаться опций браузера и уведомлений не нужных. Можно тольео одну - geolacations
        WebDriver driver = new ChromeDriver(options); //добавить - options в ХромДрайвер       
             
        driver.navigate().to("https://www.spicejet.com"); //правильный переход на сайт
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // ждем 5 сек для загрузки ВСЕХ элементов сайта
        
        String searchBtnPath = "//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[7]/div[2]/div[1]";
        
        WebDriverWait btnWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        btnWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searchBtnPath)));
        
        WebElement searchBtn = driver.findElement(By.xpath(searchBtnPath));
        searchBtn.click();
    }
}