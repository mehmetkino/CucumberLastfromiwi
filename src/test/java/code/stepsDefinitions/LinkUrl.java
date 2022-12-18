package code.stepsDefinitions;
import org.openqa.selenium.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LinkUrl {

        public static String getLinkUrl(WebDriver driver, String linkDescription) {
            String url="";
            List<WebElement> Links=driver.findElements(By.tagName("a"));

            for(WebElement each:Links){

                if (each.getText().contains(linkDescription)){
                  url = each.getAttribute("href");
                }

        }
       return url;
    }
}
