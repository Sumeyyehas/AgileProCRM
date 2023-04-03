package com.Crm.pages;

import com.Crm.utilities.ConfigurationReader;
import com.Crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name= "USER_LOGIN")
    public WebElement inputUsername;

    @FindBy(name= "USER_PASSWORD")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    public void login(){
        this.inputUsername.sendKeys("hr2@cybertekschool.com");
        this.inputPassword.sendKeys("UserUser");
        this.loginButton.click();
    }



}
