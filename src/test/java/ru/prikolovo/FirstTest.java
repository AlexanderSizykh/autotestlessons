package ru.prikolovo;

import org.junit.Assert;
import org.junit.Test;

public class FirstTest extends WebDriverSettings {

    @Test
    public void firstTest() {

        driver.get("https://prikolovo.ru/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("ПРИКОЛОВО :: магазин приколов и подарков! Все для отличного праздника!"));
    }
    @Test
    public void firstTest2() {

        driver.get("https://prikolovo.ru/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("ПРИКОЛОВО :: магазин приколов и подарков! Все для отличного праздника!"));
    }

}
