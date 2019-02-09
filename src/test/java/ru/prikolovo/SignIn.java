package ru.prikolovo;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class SignIn extends WebDriverSettings {
    WebElement GuestMenuDiv;
    // CSS selectors
    String classErr = "[class=\"error\"]";
    String classGuest = "[class=\"guest\"]";
    String classJoinDialog = "[class=\"join inDialog\"]";
    String classAuth = "[class=\"authorization formStyle\"]";
    String valueSignIn = "[value=\"Войти\"]";

    @Test
            public void signIn() {

        driver.get(SiteUrl);
        driver.manage().deleteAllCookies();

        GuestMenuDiv = driver.findElement(By.cssSelector(classGuest));
        GuestMenuDiv.findElement(By.cssSelector(classJoinDialog)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(classAuth)));

        driver.findElement(By.cssSelector("[name=\"login\"]")).sendKeys(login);
        driver.findElement(By.cssSelector("[name=\"pass\"]")).sendKeys(pass);
        driver.findElement(By.cssSelector(valueSignIn)).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"personal\"]")));


    }

    @Test
    public void signInFalure() {

        driver.get(SiteUrl);
        driver.manage().deleteAllCookies();

        GuestMenuDiv = driver.findElement(By.cssSelector(classGuest));
        GuestMenuDiv.findElement(By.cssSelector(classJoinDialog)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(classAuth)));
        driver.findElement(By.cssSelector(valueSignIn)).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(classErr)));

        Assert.assertEquals (signInErrorMsg, driver.findElement(By.cssSelector(classErr)).getText());


    }
}
