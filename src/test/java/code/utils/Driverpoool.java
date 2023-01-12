package code.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

public class Driverpoool {


    private static ThreadLocal<WebDriver> driverpool=new ThreadLocal<>();

    private Driverpoool(){
    }


    public WebDriver SetupDriverpool(){
        if (driverpool.get()==null){
            synchronized (Driverpoool.class){// will help to run paralelel it will assign one driver to each test

                switch (ConfigurationsReader.getProperties("browser")){

                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driverpool.set(new ChromeDriver());
                        break;
                    case "chrome-headless":
                        WebDriverManager.chromedriver().setup();
                        driverpool.set(new ChromeDriver(new ChromeOptions().setHeadless(true)));
                        break;
                    case "safari":
                        WebDriverManager.safaridriver().setup();
                        driverpool.set(new SafariDriver());
                        break;
                    default:
                        driverpool.set(null);
                }
            }
        }
        return driverpool.get();
    }




    public void CloseDriver(){

        if (driverpool.get()!=null){
            driverpool.get().quit();
            driverpool.remove();
        }
    }

}
