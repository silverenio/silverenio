package pages;

import libs.WebElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static libs.ConfigData.ui;

/**
 * Created by Anton on 12-Mar-15.
 */
public class JournalPage {

    WebDriver driver;
    WebElements elements;
    WebDriverWait waitForConditions;
    Logger logger;

    public JournalPage(WebDriver driver) {
        this.driver=driver;
        elements = new WebElements(driver);
        logger = Logger.getLogger(JournalPage.class);
    }

    String errorMsg = "<<< FAILED, link is incorrect >>>";

    public void openJournal(){

        elements.clickTab("LeftMenuPage.journal");
        if (driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/myjournal/user4"))
//            System.out.println("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
            logger.info("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
        else
//            System.out.println(errorMsg);
            logger.info(errorMsg);

        elements.clickButton("JournalPage.newButton");
        elements.inputText("JournalPage.titleField", "Title");
        elements.inputText("JournalPage.entryField","Entry");
        elements.inputText("JournalPage.videoField","https://www.youtube.com/watch?v=9bZkp7q19f0");
        elements.clickButton("JournalPage.publishButton");

        waitForConditions = new WebDriverWait(driver, 15);
        waitForConditions.until(ExpectedConditions.visibilityOfElementLocated(ui("JournalPage.commentField")));

        elements.inputText("JournalPage.commentField","comment");
        elements.clickButton("JournalPage.postComment");



    }
}
