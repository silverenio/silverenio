package pages;


import libs.WebElements;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static libs.ConfigData.ui;

public class UserLoggedInPage {

    WebDriver driver;
    WebElements elements;

    public UserLoggedInPage(WebDriver driver){
        this.driver = driver;
        elements = new WebElements(driver);
    }

//    public boolean isUserLoggedIn(){
//        if (driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/home"))
//            return true;
//        return false;

        public boolean isUserLoggedIn(){
            //return elements.isElementPresent(settingButton);
        try {
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            driver.findElement(ui("LeftMenuPage.home"));
            return true;
        } catch (NoSuchElementException exception){
            return false;
        } finally {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        // return driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/home");
    }



}
