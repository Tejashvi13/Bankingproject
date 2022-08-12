package com.bankproject.model.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;

public class ManagerPage extends LoginPage {
    
    public ManagerPage(WebDriver driver) {
        super(driver);
    }
    
    public ManagerPage clickAddCustomer() {
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
        return this;
    }

    public ManagerPage setData(String input, String id) {
        driver.findElement(By.xpath(id)).sendKeys(input);
        return this;
    }

    public ManagerPage setCustomerData() {
        this.setData("Mayuu", "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
            .setData("Qwerty", "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")
            .setData("QS2570", "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]");
        return this;
    }

    public ManagerPage clickAddCusButton() {
        driver.findElement(By.className("btn-default")).click();
        return this;
    }

    public String getAlertMessage() {
        String alertText = "abc";
        try {
            clickAddCusButton();
        } catch (UnhandledAlertException f) {
            try {
                Alert alert = driver.switchTo().alert();
                alertText = alert.getText();
                alert.accept();
            } catch (NoAlertPresentException e ) {}
        }  
        return alertText;
    }
}
