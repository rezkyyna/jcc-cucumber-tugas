package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='My Account']")
    private WebElement account;
    @FindBy(xpath = "//input[@id='username']")
    private WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;
    @FindBy(xpath = "//button[@name='login']")
    private WebElement btnlogin;
    @FindBy(xpath = "//p[contains(text(),'Hello')]")
    private WebElement txtHello;
    @FindBy(xpath = "//p[contains(text(),'Hello')]//a[contains(text(),'Log out')]")
    private WebElement logout;
    @FindBy(xpath = "//a[@title='Password Lost and Found']")
    private WebElement errorMessageWrongPassword;
    @FindBy(xpath = "//strong[normalize-space()='Error:']")
    private WebElement errorMessage;


    public void tabAccount(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        account.click();
    }

    public void username(String username){
        this.username.sendKeys(username);
    }
    public void password(String password){
        this.password.sendKeys(password);
    }
    public void clickButtonLogin(){
        btnlogin.click();
    }
    public void getTextHello(){
        txtHello.click();
    }

    public void logout(){
        logout.click();
    }
    public void getTxtErrorWrongPassword(){
        errorMessageWrongPassword.click();
    }
    public void getErrorMessage(){
        errorMessage.click();
    }
}
