package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class guru99TelecomHome extends BrowserUtils {
    public guru99TelecomHome(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//div//h3//a[.='Add Customer']") // or (a[='Add Customer'])[1]   same
    private WebElement addCustomer;
    @FindBy(xpath = "//h1[.='Add Customer']")
    private WebElement AddCustomerHeader;

    @FindBy(xpath ="//input[@type='radio']")
    private List<WebElement> BackgroundCheck;

    @FindBy(id ="fname")
    private WebElement FirstName;

    @FindBy(id ="lname")
    private WebElement lastName;

    @FindBy(id="email")
    private WebElement email;

    @FindBy(xpath = "//textarea[@id='message']")
    private WebElement adress;

    @FindBy(id = "telephoneno")
    private WebElement telephone;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitButton;


    @FindBy(xpath = "//h1[.='Access Details to Guru99 Telecom']")
    private WebElement verificationHeader;



    public void setAddCustomer() {
            addCustomer.click();

    }

    public void setAddCustomerHeader(String expected) {
        Assert.assertEquals(AddCustomerHeader.getText(),expected);

    }

    public void setBackgroundCheck(String  backgroundChecK) {
        for (WebElement each:BackgroundCheck){
            if (each.getAttribute("id").equalsIgnoreCase(backgroundChecK)){
                //each.click();
                JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
                js.executeScript("arguments[0].click();",each);

            }

        }
    }

    public void setFirstName(String firstname) {
        staticWait(1);

        FirstName.click();
        FirstName.sendKeys(firstname);
    }

    public void setLastName(String lastname) {
       lastName.sendKeys(lastname);
    }

    public void setId(String emaiL) {
        email.sendKeys(emaiL);
    }

    public void setAdress(String adRess) {
        adress.sendKeys(adRess);
    }

    public void setTelephone(String telephone1) {
        telephone.sendKeys(telephone1);
    }

    public void setSubmitButton() {
        submitButton.click();
    }

    public WebElement getVerificationHeader() {
        return this.verificationHeader;
    }




}
