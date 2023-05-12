
package com.mycompany.testdemonew;

import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestDemoNew {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        
        WebElement element = driver.findElement(By.name("q")); // атрибут q лучше поменять на Xpath
        element.sendKeys("selenium");
        element.sendKeys(Keys.ENTER);
        //element.sendKeys("selenium" + "\n");  //используя перенос строки
        //element.submit(); //тоже работает
        //WebElement btn = (WebElement) driver.findElement( //кликаем на кнопку "Поиск в Googlе" через Xpath
        //        By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]"));
        //btn.click();  //имитация клика мышкой, кнопка должна быть ВИДНА! Если не видна(закрыта посказками, напр) клика не будет
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); //метод manage поволяет обратиться к любым настройкам браузера
        driver.manage().window().maximize();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://ya.ru"); //открыты 2 вкладки dв браузере
        driver.switchTo().window(
                new ArrayList<String>(driver.getWindowHandles()).get(0)); //помещаем заголовки в список и выбираем 1й, чтобы прейти обратно в Google
        WebElement poisk = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        if(poisk.getAttribute("value").equals("selenium"))
            System.out.println("OK"); //проверка, что в строке поиска слово "selenium" осталось
        
        //WebElement krestik = driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/span[1]/*[1]"));
        //krestik.click(); //почему-то не работает..
        //driver.navigate().refresh(); //метод navigate поволяет браузер направлять вперед\назал\домой, обновить
        
        //driver.quit();
       
    }
}
