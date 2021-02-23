package com.hackerrank.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.*;
import java.util.concurrent.TimeUnit;


public class OnlineSurvey {
    public static void fillDateOfBirth(WebDriver driver, String pageUrl) {
        // complete implementation
        driver.get(pageUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByVisibleText("February");
        Select day = new Select(driver.findElement(By.id("day")));
        day.selectByVisibleText("22");
        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByVisibleText("1990");

    }

    public static void answerQuestions(WebDriver driver, String pageUrl) {
        // complete implementation

        driver.get(pageUrl);
        WebElement language = driver.findElement(By.xpath("//input[@value='Java']"));
        language.click();
        WebElement OS = driver.findElement(By.xpath("//input[@value='Linux']"));
        OS.click();
        WebElement IDEA = driver.findElement(By.xpath("//input[@value='IntelliJ IDEA']"));
        IDEA.click();
        WebElement submit = driver.findElement(By.xpath("//button[@value='Send']"));
        submit.click();

    }
}
