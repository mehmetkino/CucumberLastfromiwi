package code.stepsDefinitions;

import code.pages.TEstlogin;
import code.utils.BrowserUtils;
import code.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class guru99loginDTT extends BrowserUtils {

    TEstlogin tl=new TEstlogin();
    @Given("User wants to go to https:\\/\\/demo.guru99.com\\/test\\/login.html")
    public void user_wants_to_go_to_https_demo_guru99_com_test_login_html() {
        Driver.getDriver().get("https://www.testyou.in/Login.aspx");


    }
    @When("User wants to fill out login info as {string},{string}")
    public void user_wants_to_fill_out_login_info_as(String email, String pass) {
     tl.setEmailinput(email);
     tl.setPasswordInput(pass);
    }
    @Then("The user wants to click on Google login button")
    public void the_user_wants_to_click_on_google_login_button() {
     tl.Clicklogin();
    }
    @Then("User wants to verify that invalid info")
    public void user_wants_to_verify_that_invalid_info() {
     String actualMsg=tl.getErrorMessage();
        String expectedMsg="Userid or Password did Not Match !!";
        Assert.assertTrue(actualMsg.contains(expectedMsg));

    }

}
