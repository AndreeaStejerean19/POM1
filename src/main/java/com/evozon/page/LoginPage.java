package com.evozon.page;

import com.evozon.helper.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    private final String PATH = "/customer/account/login/";

    public String getPath() {
        return PATH;
    }

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id= "email")
        private WebElement emailInpt;
    @FindBy(id="pass")
        private WebElement passInput;
    @FindBy(id="send2")
            private WebElement loginButton;

    public void getLoginPage(){
       getDriver().get(Constants.BASE_URL + PATH);
    }


    public void login(String userEmail, String userPass){
        emailInpt.sendKeys(userEmail);
        passInput.sendKeys(userPass);
        loginButton.click();
    }


}
