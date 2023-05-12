package tests;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ObzorTestNGTest {
    
    public ObzorTestNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test  //аннатацию нужно импортировать
    public void hello() {
        System.out.println("Test");
    }

    @Test
    public void hello2() {
        System.out.println("Test 2");
    }
    
    @BeforeClass // аннотации - часть фреймворка
    public static void setUpClass() throws Exception {
        System.out.println("Before class");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("After class");
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.out.println("Before method");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        System.out.println("After method");
    }
}

//file:///C:/Users/Алик/Documents/NetBeansProjects/TestNGobzor/target/surefire-reports/index.html#
//смотрим отчет