package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TEstlogin extends BrowserUtils {

  public TEstlogin(){
      PageFactory.initElements(Driver.getDriver(),this);
  }

  @FindBy(css = "input#ctl00_CPHContainer_txtUserLogin")
    private WebElement emailinput;

  @FindBy(css="input#ctl00_CPHContainer_txtPassword")
    private WebElement passwordInput;


  @FindBy(xpath = "(//input[@value='Login'])[2]")
  private WebElement loginbutton;


@FindBy(xpath = "//span[@id='ctl00_CPHContainer_lblOutput']")
private WebElement ErrorMessage;

  public void setEmailinput(String email){

      emailinput.sendKeys(email);

  }

  public void setPasswordInput(String passoword){

      passwordInput.sendKeys(passoword);
  }


public void Clicklogin(){
      loginbutton.click();
}

public String getErrorMessage(){
      return ErrorMessage.getText();
}




}
