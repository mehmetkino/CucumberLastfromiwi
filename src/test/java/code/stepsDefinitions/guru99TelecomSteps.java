package code.stepsDefinitions;

import code.pages.guru99TelecomHome;
import code.utils.BrowserUtils;
import code.utils.ConfigurationsReader;
import code.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.logging.Logger;


public class guru99TelecomSteps extends BrowserUtils {

    guru99TelecomHome guru99Teleccom=new guru99TelecomHome();


    @Given("The user wants to see guru demo site")
    public void The_user_wants_to_see_guru_demo_site(){
        Driver.getDriver().get(ConfigurationsReader.getProperties("guru99Telecomurl"));
        Driver.getDriver().manage().window().maximize();
    }
    @When("the user wants to add customer")
    public void the_user_wants_to_add_customer() {
    guru99Teleccom.setAddCustomer();
        Actions action=new Actions(Driver.getDriver());
        action.moveByOffset(0,0).click().build().perform();
    }
    @Then("The users wants to verify {string} header")
    public void the_users_wants_to_verify_header(String header) {
        staticWait(2);
        guru99Teleccom.setAddCustomerHeader(header);

    }
    @Then("The user wants to enter background check as {string}")
    public void the_user_wants_to_enter_background_check_as(String backgroundcheck) {
        staticWait(2);
       guru99Teleccom.setBackgroundCheck(backgroundcheck);

    }
    @Then("The user wants to enter billing address as {string} and {string} and {string} and {string} and {string}")
    public void the_user_wants_to_enter_billingaddress_as_and_and_and_and(String firstname, String lastname, String email, String adress, String telephone) {
        guru99Teleccom.setFirstName(firstname);

        guru99Teleccom.setLastName(lastname);

        guru99Teleccom.setId(email);

        guru99Teleccom.setAdress(adress);

        guru99Teleccom.setTelephone(telephone);

    }
    @Then("The wants to verify message as {string}")
    public void the_wants_to_verify_message_as(String string) {
        guru99Teleccom.setSubmitButton();
        Assert.assertEquals(guru99Teleccom.getVerificationHeader().getText(),string);

    }



}
