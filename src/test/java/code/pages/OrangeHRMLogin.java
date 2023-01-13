package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLogin extends BrowserUtils {


    @FindBy(id = "txtUsername")
    private WebElement userName;

    @FindBy(id = "txtPassword")
    private WebElement password;

    @FindBy(id = "btnLogin")
    private WebElement LoginButton;
    public OrangeHRMLogin(){
        PageFactory.initElements(Driver.getDriver(),this);}

    public void setUserName(String username) {
        staticWait(1);
        userName.sendKeys(username);

        if (username==null){

        }
    }
    public void setDatafromExcel(String username, String passWord){
        userName.sendKeys(username);
         password.sendKeys(passWord);

    }

    public void setPassword(String passWord) {
       password.sendKeys(passWord);
    }

    public void setLoginButton() {
        LoginButton.click();
    }


}
