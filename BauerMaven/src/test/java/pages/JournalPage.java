package pages;

import libs.WebElements;
import org.openqa.selenium.WebDriver;

/**
 * Created by Anton on 12-Mar-15.
 */
public class JournalPage {

    WebDriver driver;
    WebElements elements;

    public JournalPage(WebDriver driver) {
        this.driver=driver;
        elements = new WebElements(driver);
    }

    String errorMsg = "<<< FAILED, link is incorrect >>>";

    public void openJournal(){

        elements.clickTab("LeftMenuPage.journal");
        if (driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/myjournal/user4"))
            System.out.println("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
        else
            System.out.println(errorMsg);

        elements.clickButton("JournalPage.newButton");
        elements.inputText("JournalPage.titleField","Title");
        elements.inputText("JournalPage.entryField","Entry");
        elements.inputText("JournalPage.videoField","https://www.youtube.com/watch?v=9bZkp7q19f0");
        elements.clickButton("JournalPage.publishButton");
        elements.inputText("JournalPage.commentField","comment");
        elements.clickButton("JournalPage.postComment");



    }
}
