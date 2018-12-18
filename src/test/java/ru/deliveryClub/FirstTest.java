package ru.deliveryClub;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "/chromedriver/chromedriver.exe" );
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://deliveryclub.ru");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("«Delivery Club» — круглосуточная доставка из любимых ресторанов города"));

        driver.quit();


    }
}
