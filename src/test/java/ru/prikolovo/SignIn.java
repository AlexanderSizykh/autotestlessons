package ru.prikolovo;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SignIn extends WebDriverSettings {

    @Test
            public void signIn() {
        String login = "legendsofaria@gmail.com";
        String pass = "фгещеуые";
        driver.get("https://prikolovo.ru/");
        driver.manage().deleteAllCookies();

        WebElement divGuest = driver.findElement(By.cssSelector("[class=\"guest\"]"));
        divGuest.findElement(By.cssSelector("[class=\"join inDialog\"]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"authorization formStyle\"]")));

        driver.findElement(By.cssSelector("[name=\"login\"]")).sendKeys(login);
        driver.findElement(By.cssSelector("[name=\"pass\"]")).sendKeys(pass);
        driver.findElement(By.cssSelector("[value=\"Войти\"]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"personal\"]")));


    }
}
