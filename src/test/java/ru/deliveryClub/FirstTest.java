package ru.deliveryClub;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "/chromedriver/chromedriver.exe" );
        ChromeDriver driver = new ChromeDriver();

        driver.get("http://deliveryclub.ru");


    }
}
