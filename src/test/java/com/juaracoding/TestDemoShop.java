package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.DemoShop;
import com.juaracoding.utils.Constants;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestDemoShop {
    private static WebDriver driver;
    private static DemoShop demoShop;

    @BeforeAll
    public static void setUp(){
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        demoShop = new DemoShop();
    }

    @AfterAll
    public static void finish(){
        DriverSingleton.delay(2);
        DriverSingleton.closeObjectInstance();
    }
    //TCC.DQS.001
    @Given("User enter url DQS")
    public void user_enter_url_hrm(){ //pakaisnakecase

        driver.get(Constants.URL);
    }

    @When("User click tab account")
    public void user_click_tab_account(){

        demoShop.tabAccount();
    }
    @And("User input valid username")
    public void user_input_valid_username(){

        demoShop.username("RezkyKarunia8@gmail.com");
    }
    @And("User input valid password")
    public void user_input_valid_password(){

        demoShop.password("Kitabersama");
    }

    @And("User click button login")
    public void user_click_button_login(){

        demoShop.clickButtonLogin();
    }
    @Then("User get text Hello on dashboard")
    public void user_get_text_Hello_on_dashboard(){
        demoShop.getTextHello();
    }


    //TCC.DQS.002
   @Given("User logout")
   public void user_logout(){
        demoShop.logout();
    }
    @When("User input empty username")
    public void user_input_empty_username(){

        demoShop.username("");
    }
    @And("User input empty password")
    public void user_input_empty_password(){

        demoShop.password("");
    }
    @Then("User get text Error message")
    public void user_get_text_error_message(){

        demoShop.getErrorMessage();
    }

    //TCC.DQS.003

    @Given("User clear username")
    public void user_clear_username(){
        demoShop.clearUsername();
    }
    @And("User input invalid password")
    public void user_input_invalid_password(){
        demoShop.password("kita24356");
      }
      @Then("User get text ERROR")
     public void user_get_text_error(){
           demoShop.getTxtErrorWrongPassword();
      }

    //TCC.DQS.021
    @And("User click tab demosite")
    public void user_click_tab_demosite(){
        demoShop.tabDemosite();
    }
    @And("User click tshirt product")
    public void user_click_tshirt_product(){
        demoShop.chooseTshirt();
    }

    @And("User choose color tshirt")
    public void user_choose_color_tshirt(){
        demoShop.chooseColorTshirt("Pink");
    }
    @And("User choose size tshirt")
    public void user_choose_size_tshirt(){
        demoShop.chooseSizeTshirt("36");
    }
    @And("User click button add to cart")
    public void user_click_button_add_to_cart(){
        demoShop.addToCart();
    }
    @Then("User get text tshirt added to your cart")
    public void user_get_text_tshirt_added_to_your_cart(){
        demoShop.getTxtProductAdded();
    }

    //TCC.DQS.022
    @Given("User click button clear")
    public void user_click_button_clear(){
        demoShop.clearButton();
    }
    @And("User not choose size tshirt")
    public void user_not_choose_size_tshirt(){
        demoShop.chooseSizeTshirt("Choose an option");
    }

    //TCC.DQS.023
    //@When("User not choose color tshirt")
       // public void user_not_choose_color_tshirt(){
           // demoShop.chooseColorTshirt("Choose an option");
    //}






}
