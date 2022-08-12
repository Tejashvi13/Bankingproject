package com.bankproject.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    protected WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public CustomerPage CusLoginButton() {
        driver.findElement(By.cssSelector("[ng-click='customer()']")).click();
        return new CustomerPage(driver);
    }  

    public ManagerPage ManagerLoginButton() {
        driver. findElement(By.cssSelector("[ng-click='manager()']")).click();
        return new ManagerPage(driver);
    }
}