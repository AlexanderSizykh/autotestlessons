package ru.prikolovo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class SignIn extends WebDriverSettings {
    public WebElement GuestMenuDiv;
    @Test
            public void signIn() {

        driver.get(SiteUrl);
        driver.manage().deleteAllCookies();

        GuestMenuDiv = driver.findElement(By.cssSelector("[class=\"guest\"]"));
        GuestMenuDiv.findElement(By.cssSelector("[class=\"join inDialog\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"authorization formStyle\"]")));

        driver.findElement(By.cssSelector("[name=\"login\"]")).sendKeys(login);
        driver.findElement(By.cssSelector("[name=\"pass\"]")).sendKeys(pass);
        driver.findElement(By.cssSelector("[value=\"Войти\"]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"personal\"]")));


    }

    @Test
    public void signInFalure() {
        driver.get(SiteUrl);
        driver.manage().deleteAllCookies();

        GuestMenuDiv = driver.findElement(By.cssSelector("[class=\"guest\"]"));
        GuestMenuDiv.findElement(By.cssSelector("[class=\"join inDialog\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"authorization formStyle\"]")));
        driver.findElement(By.cssSelector("[value=\"Войти\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"error\"]")));
        // TODO
        // сделать ассерты для сообщений об ошибках


    }
}
