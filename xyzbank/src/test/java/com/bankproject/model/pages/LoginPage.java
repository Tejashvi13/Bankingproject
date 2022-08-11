package com.bankproject.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    protected WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public CustomerPage CusLoginButton() {
        driver.findElement(By.xpath("//button[contains(text(),'Customer Login')]")).click();
        return new CustomerPage(driver);
    }  

    public ManagerPage ManagerLoginButton() {
        driver. findElement(By.xpath("//button[contains(text(),'Bank Manager Login')]")).click();
        return new ManagerPage(driver);
    }
}