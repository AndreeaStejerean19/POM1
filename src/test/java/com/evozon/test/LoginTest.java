package com.evozon.test;

import com.evozon.helper.Constants;
import com.evozon.page.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseTest{
    LoginPage loginPage;
    @Test
    public void LoginTest() {

        loginPage=new LoginPage(driver);
        loginPage.getLoginPage();
        loginPage.login(Constants.USER_NAME, Constants.USER_PASS);

        Assert.assertEquals(Constants.BASE_URL + loginPage.getPath(), driver.getCurrentUrl());

    }

}
