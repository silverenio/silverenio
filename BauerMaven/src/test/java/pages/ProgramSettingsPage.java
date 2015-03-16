package pages;


import libs.WebElements;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static libs.ConfigData.ui;

public class ProgramSettingsPage {
    WebDriver driver;
    WebElements elements;
    WebDriverWait waitForConditions;

    public ProgramSettingsPage(WebDriver driver) {
        this.driver=driver;
        elements = new WebElements(driver);
    }

    String errorMsg = "<<< FAILED, link is incorrect >>>";

    public void changeDayNumber(){

        WebElement element = driver.findElement(ui("EditProfilePage.accountLinkDropdown"));
        WebElement element2 = driver.findElement(ui("ProgramSettingsPage.programSettingsLink"));

        Actions actions = new Actions(driver);
        actions.moveToElement(element).moveToElement(element2).click().perform();

        elements.inputText("ProgramSettingsPage.todayIsDayField","30");
        elements.clickButton("ProgramSettingsPage.updateDayButton");

        Alert alert = driver.switchTo().alert();
        alert.accept();

        waitForConditions = new WebDriverWait(driver, 2);
        waitForConditions.until(ExpectedConditions.visibilityOfElementLocated(ui("ProgramSettingsPage.closeConfirmationMsg")));

        elements.clickLink("ProgramSettingsPage.closeConfirmationMsg");
        elements.clickTab("ProgramSettingsPage.home");
        elements.clickTab("LeftMenuPage.meals");
        elements.clickLink("ProgramSettingsPage.nextDay");
}
}
