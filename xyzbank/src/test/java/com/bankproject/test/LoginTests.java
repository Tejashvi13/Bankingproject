package com.bankproject.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.bankproject.model.pages.AccountPage;
import com.bankproject.model.pages.CustomerPage;
import com.bankproject.model.pages.ManagerPage;

public class LoginTests extends BaseTests {
    @Test
    public void verifyLogout() {

        var Loginconfirm = new CustomerPage(driver)
            .CusLoginButton()
            .selectName()
            .clickLoginButton()
            .getLoginInfo();

        assertEquals("Harry Potter", Loginconfirm);

        var Logoutconfirm = new AccountPage(driver)
            .clickLogoutButton()
            .getLogoutInfo();

        assertEquals("Your Name :", Logoutconfirm);
    }

    @Test
    public void verifyDeposit() {
        var depositconfirm = new AccountPage(driver)
            .CusLoginButton()
            .selectName()
            .clickLoginButton()
            .clickDeposit()
            .setAmount()
            .clickDepositButton()
            .getSuccessMessage();

        assertEquals("Deposit Successful", depositconfirm);
    }

    @Test
    public void verifyAddCustomer() {
        var newcustomer = new ManagerPage(driver)
            .ManagerLoginButton()
            .clickAddCustomer()
            .setCustomerData()
            .clickAddCusButton()
            .getAlertMessage();

        assertEquals("Customer added successfully with customer id :6", newcustomer);       
    }
}
