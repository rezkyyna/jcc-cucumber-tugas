package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestLogin {
    private static WebDriver driver;
    private static LoginPage loginPage;

    @BeforeAll
    public static void setUp(){
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        loginPage = new LoginPage();
    }

    @AfterAll
    public static void finish(){
        DriverSingleton.delay(2);
        DriverSingleton.closeObjectInstance();
    }
    //TCC.DQS.001
    @Given("User enter url HRM")
    public void user_enter_url_hrm(){ //pakaisnakecase

        driver.get(Constants.URL);
    }

    @When("User click tab account")
    public void user_click_tab_account(){

        loginPage.tabAccount();
    }

    @And("User input valid username")
    public void user_input_valid_username(){

        loginPage.username("RezkyKarunia8@gmail.com");
    }

    @And("User input valid password")
    public void user_input_valid_password(){

        loginPage.password("Kitabersama");
    }

    @And("User click button login")
    public void user_click_button_login(){

        loginPage.clickButtonLogin();
    }
    @Then("User get text Hello on dashboard")
    public void user_get_text_Hello_on_dashboard(){
        loginPage.getTextHello();
    }

    //TCC.DQS.002
    @Given("User logout")
    public void user_logout(){
        loginPage.logout();
    }
    @And("User input invalid password")
    public void user_input_invalid_password(){
        loginPage.password("kita24356");
    }
    @Then("User get text ERROR")
    public void user_get_text_error(){
        loginPage.getTxtErrorWrongPassword();
    }

    //TCC.DQS.003
    @Given("User input empty username")
    public void user_input_empty_username(){
        loginPage.username("");
    }
    @Given("User input empty password")
    public void user_input_empty_password(){
        loginPage.password("");
    }
    @Then("User get text Error")
    public void user_get_text_error(){
        loginPage.getErrorMessage();
    }



}
