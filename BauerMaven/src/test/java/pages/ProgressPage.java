package pages;

import libs.WebElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static libs.ConfigData.ui;

public class ProgressPage {

    WebDriver driver;
    WebElements elements;
    WebDriverWait waitForConditions;
    Logger logger;

    public ProgressPage(WebDriver driver) {
        this.driver=driver;
        elements = new WebElements(driver);
        logger = Logger.getLogger(ProgressPage.class);
    }

    String errorMsg = "<<< FAILED, link is incorrect >>>";

    public void setTheGraph () {
        elements.clickTab("LeftMenuPage.progress");
        if (driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/progress"))
//            System.out.println("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
            logger.info("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
        else
//            System.out.println(errorMsg);
            logger.info(errorMsg);

        elements.clickLink("ProgressPage.editLink");
        if (driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/account/tracking"))
//            System.out.println("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
            logger.info("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
        else
//            System.out.println(errorMsg);
            logger.info(errorMsg);

        elements.selectCheckBox("ProgressPage.currentWeightCheckbox", true);

        elements.clickButton("ProgressPage.saveButton");

    }

    public void trackWeight(){

        waitForConditions = new WebDriverWait(driver, 3);
        waitForConditions.until(ExpectedConditions.visibilityOfElementLocated(ui("ProgressPage.chart")));

        elements.clickLink("ProgressPage.updateLink");

        waitForConditions = new WebDriverWait(driver, 3);
        waitForConditions.until(ExpectedConditions.visibilityOfElementLocated(ui("ProgressPage.inputField")));

        elements.inputText("ProgressPage.inputWeight", "190");
        elements.clickButton("ProgressPage.trackButton");
    }
}