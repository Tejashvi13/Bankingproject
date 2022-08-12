package com.bankproject.model.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AccountPage extends LoginPage {

    public AccountPage(WebDriver driver) {
        super(driver);
    }
    
    public CustomerPage clickLogoutButton() {
        driver.findElement(By.cssSelector(".btn.logout")).click();
        return new CustomerPage(driver);
    }

    public String getLoginInfo() {
        return new WebDriverWait(driver, Duration.ofSeconds(60)).until(
            d -> d.findElement(By.cssSelector(".fontBig.ng-binding")).getText());
    }

    public AccountPage setInput(String input, String id) {
        driver.findElement(By.className(id)).sendKeys(input);
        return this;
    }

    public AccountPage clickDeposit() {
        driver.findElement(By.cssSelector("[ng-class='btnClass2']")).click();
        return this;
    }

    public AccountPage setAmount() {
        this.setInput("200", "form-control");
        return this;
    }

    public AccountPage clickDepositButton() {
        driver.findElement(By.className("btn-default")).click();
        return this;
    }

    public String getSuccessMessage() {
        return new WebDriverWait(driver, Duration.ofSeconds(60)).until(
            d -> d.findElement(By.className("error")).getText());
    }
}
