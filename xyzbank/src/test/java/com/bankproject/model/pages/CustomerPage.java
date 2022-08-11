package com.bankproject.model.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CustomerPage extends LoginPage {
    public CustomerPage(WebDriver driver) {
        super(driver);
      }

    public CustomerPage selectName() {
        Select name = new Select(driver.findElement(By.name("userSelect")));
        name.selectByVisibleText("Harry Potter");
        return new CustomerPage(driver);
    }

    public AccountPage clickLoginButton() {
        driver.findElement(By.className("btn-default")).click();
        return new AccountPage(driver);
    }

    public String getLogoutInfo(){
        return new WebDriverWait(driver, Duration.ofSeconds(60)).until(
          d -> d.findElement(By.xpath("//label[contains(text(),'Your Name :')]")).getText());
      }
}

