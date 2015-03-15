package pages;


import libs.WebElements;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

        WebElement element = driver.findElement(By.xpath("//li[@class='user sub']"));
        WebElement element2 = driver.findElement(By.xpath("//a[@href='/account/program']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(element).moveToElement(element2).click().perform();

        elements.inputText("ProgramSettingsPage.todayIsDayField","30");
        elements.clickButton("ProgramSettingsPage.updateDayButton");
        Alert alert = driver.switchTo().alert();
        alert.accept();
        elements.clickButton("ProgramSettingsPage.closeConfirmationMsg");
        elements.clickTab("ProgramSettingsPage.home");
        elements.clickTab("LeftMenuPage.meals");
        elements.clickLink("ProgramSettingsPage.nextDay");
}
}
