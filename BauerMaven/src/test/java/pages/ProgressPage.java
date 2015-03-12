package pages;

import libs.WebElements;
import org.openqa.selenium.WebDriver;

/**
 * Created by Anton on 12-Mar-15.
 */
public class ProgressPage {

    WebDriver driver;
    WebElements elements;

    public ProgressPage(WebDriver driver) {
        this.driver=driver;
        elements = new WebElements(driver);
    }

    String errorMsg = "<<< FAILED, link is incorrect >>>";

    public void setTheGraph () {
        elements.clickTab("LeftMenuPage.progress");
        if (driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/progress"))
            System.out.println("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
        else
            System.out.println(errorMsg);

        elements.clickLink("ProgressPage.editLink");
        if (driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/account/tracking"))
            System.out.println("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
        else
            System.out.println(errorMsg);

        elements.selectCheckBox("ProgressPage.currentWeightCheckbox", true);

        elements.clickButton("ProgressPage.saveButton");

    }




    public void trackWeight(){

        elements.inputText("ProgressPage.inputWeight", "190");
        elements.clickButton("ProgressPage.trackButton");
    }
}