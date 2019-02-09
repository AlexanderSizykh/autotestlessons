package ru.prikolovo;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverSettings {
    String SiteUrl = "https://prikolovo.ru/";
    String login = "legendsofaria@gmail.com";
    String pass = "фгещеуые";
    String signInErrorMsg = "Неверный e-mail или пароль";
    ChromeDriver driver;
    WebDriverWait wait;

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
