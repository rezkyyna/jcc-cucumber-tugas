package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoShop {
    private WebDriver driver;

    public DemoShop() {
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
    @FindBy(xpath = "//a[@class='custom-logo-link']//img[@alt='ToolsQA Demo Site']")
    private WebElement logoClick;

    @FindBy(xpath = "//a[normalize-space()='pink drop shoulder oversized t shirt']")
    private WebElement chooseTShirt;
    @FindBy(xpath = "//select[@id='pa_color']")
    private WebElement colorTshirt;
    @FindBy(xpath = "//select[@id='pa_size']")
    private WebElement sizeTshirt;
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    private WebElement addCart;
    @FindBy(xpath = "//div[@role='alert']")
    private WebElement txtMsgAdded;
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    private WebElement btnCart;
    @FindBy(xpath = "//h1[@class='page-title']")
    private WebElement pageTitle;
    @FindBy(xpath = "//span[contains(text(),'ToolsQA Demo Site')]")
    private WebElement demoSite;
    @FindBy(xpath = "//a[@class='reset_variations']")
    private WebElement btnClear;


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
    public String getTextHello(){

        return txtHello.getText();
    }

    public void logout(){
        logout.click();
    }
    public String getTxtErrorWrongPassword(){
        return errorMessageWrongPassword.getText();
    }
    public String getErrorMessage(){
        return errorMessage.getText();
    }

    public void clickLogo() {
        logoClick.click();
    }
    public void login(String username, String password){
            this.username.sendKeys(username);
            this.password.sendKeys(password);
    }

    public void tabDemosite(){
        demoSite.click();
    }
    public void chooseTshirt(){
        chooseTShirt.click();
    }
    public void chooseColorTshirt(String colorTshirt){
        this.colorTshirt.sendKeys(colorTshirt);
    }
    public void chooseSizeTshirt(String sizeTshirt){
        this.sizeTshirt.sendKeys(sizeTshirt);
    }

    public void addToCart(){

        btnCart.click();
    }
    public String getTxtProductAdded(){
        return txtMsgAdded.getText();
    }

    public void clearButton(){
        btnClear.click();
    }
    public void clearUsername(){
        username.sendKeys(Keys.CONTROL+"a");
        username.sendKeys(Keys.DELETE);
    }

    public void enter(){
        driver.findElement(By.id("")).sendKeys(Keys.ENTER);
    }
}
