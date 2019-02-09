package ru.prikolovo;

import org.junit.Assert;
import org.junit.Test;

public class FirstTest extends WebDriverSettings {

    @Test
    public void firstTest() {

        driver.get("https://prikolovo.ru/");
        String title = driver.getTitle();
        Assert.assertEquals(driver.getTitle(), "ПРИКОЛОВО :: магазин приколов и подарков! Все для отличного праздника!");
    }
}
