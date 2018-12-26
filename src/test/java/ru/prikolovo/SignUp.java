package ru.prikolovo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUp extends WebDriverSettings {
    @Test
    public void signUpFailure() {

        driver.get(SiteUrl);
        driver.manage().deleteAllCookies();
        driver.findElement(By.cssSelector("[class=\"reg inDialog\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"authorization register formStyle\"]")));
        driver.findElement(By.cssSelector("[value=\"Зарегистрироваться\"]")).click();

        // TODO
        // сделать ассерты для сообщений об ошибках

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[class=\"formFieldError\"]")));

    }



}
