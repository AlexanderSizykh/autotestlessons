package ru.prikolovo;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverSettings {
    public String SiteUrl = "https://prikolovo.ru/";
    public String login = "legendsofaria@gmail.com";
    public String pass = "фгещеуые";
    public ChromeDriver driver;
    public WebDriverWait wait;
    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }
    @After
    public void close() {
        driver.quit();
    }
}
