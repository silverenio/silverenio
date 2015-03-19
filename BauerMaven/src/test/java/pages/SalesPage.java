package pages;

import libs.WebElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class SalesPage {

    WebDriver driver;
    WebElements elements;
    Logger logger;


    public SalesPage(WebDriver driver) {
        this.driver=driver;
        elements = new WebElements(driver);
        logger = Logger.getLogger(SalesPage.class);
    }

//      private static By myProfileButton = By.xpath("//a[@id='topLoginLink']");

    public void open (){

        driver.get("https://bauer.exercise-staging.com");
    }

    public void goToLoginPage(){
//      driver.findElement(myProfileButton).click();
        elements.clickButton("SalesPage.loginButton");
        logger.info("Login button was clicked");
    }
}