package pages;


import junit.framework.Assert;
import libs.WebElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static libs.ConfigData.ui;

public class UserHomePage {

    WebDriver driver;
    WebElements elements;
    WebDriverWait waitForConditions;
    Logger logger;

    public UserHomePage(WebDriver driver) {
        this.driver = driver;
        elements = new WebElements(driver);
        logger = Logger.getLogger(UserHomePage.class);
    }

//    String errorMsg = "<<< FAILED, link is incorrect >>>";

    public void firstFlyOutCheck() {

        try {
            waitForConditions = new WebDriverWait(driver, 2);
            waitForConditions.until(ExpectedConditions.visibilityOfElementLocated(ui("UserHomePage.firstButton"))).click();

//            WebElement element = driver.findElement(ui("UserHomePage.firstButton"));
//            Actions actions = new Actions(driver);
//            actions.moveToElement(element).click().perform();

//            System.out.println("<<< 1st FlyOut is PRESENT >>>");
            logger.info("<<< 1st FlyOut is PRESENT >>>");
        } catch (TimeoutException exception) {
//            System.out.println("<<< 1st FlyOut is already ABSENT >>>");
            logger.info("<<< 1st FlyOut is already ABSENT >>>");
        } finally {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    }

    public void secondFlyOutCheck() {

        try {
            waitForConditions = new WebDriverWait(driver, 2);
            waitForConditions.until(ExpectedConditions.visibilityOfElementLocated(ui("UserHomePage.secondButton"))).click();

//            WebElement element = driver.findElement(ui("UserHomePage.secondButton"));
//            Actions actions = new Actions(driver);
//            actions.moveToElement(element).click().perform();

//            System.out.println("<<< 2nd FlyOut is PRESENT >>>");
            logger.info("<<< 2nd FlyOut is PRESENT >>>");
        } catch (TimeoutException exception) {
//            System.out.println("<<< 2nd FlyOut is already ABSENT >>>");
            logger.info("<<< 2nd FlyOut is already ABSENT >>>");
        } finally {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    }

    public void thirdFlyOutCheck() {

        try {
            waitForConditions = new WebDriverWait(driver, 2);
            waitForConditions.until(ExpectedConditions.visibilityOfElementLocated(ui("UserHomePage.thirdButton"))).click();

//            WebElement element = driver.findElement(ui("UserHomePage.thirdButton"));
//            Actions actions = new Actions(driver);
//            actions.moveToElement(element).click().perform();

//            System.out.println("<<< 3rd FlyOut is PRESENT >>>");
            logger.info("<<< 3rd FlyOut is PRESENT >>>");
        } catch (TimeoutException exception) {
//            System.out.println("<<< 3rd FlyOut is already ABSENT >>>");
            logger.info("<<< 3rd FlyOut is already ABSENT >>>");
        } finally {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    }


    public void clickTabs () {

        elements.clickTab("LeftMenuPage.home");
//        if (driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/home"))
//            System.out.println("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
//        else
//            System.out.println(errorMsg);
        Assert.assertTrue(driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/home"));


        elements.clickTab("LeftMenuPage.meals");
//        if (driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/meals"))
//            System.out.println("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
//        else
//            System.out.println(errorMsg);
        Assert.assertTrue(driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/meals"));

        elements.clickTab("LeftMenuPage.schedule");
//        if (driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/schedule"))
//            System.out.println("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
//        else
//            System.out.println(errorMsg);
        Assert.assertTrue(driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/schedule"));

        elements.clickTab("LeftMenuPage.shoppingList");
//        if (driver.getCurrentUrl().contains("grocery-list"))
//            System.out.println("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
//        else
//            System.out.println(errorMsg);
        Assert.assertTrue(driver.getCurrentUrl().contains("grocery-list"));

        elements.clickTab("LeftMenuPage.journal");
//        if (driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/myjournal/user4"))
//            System.out.println("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
//        else
//            System.out.println(errorMsg);
        Assert.assertTrue(driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/myjournal/user4"));

        elements.clickTab("LeftMenuPage.calorieLog");
//        if (driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/calorie-log"))
//            System.out.println("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
//        else
//            System.out.println(errorMsg);
        Assert.assertTrue(driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/calorie-log"));

        elements.clickTab("LeftMenuPage.progress");
//        if (driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/progress"))
//            System.out.println("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
//        else
//            System.out.println(errorMsg);
        Assert.assertTrue(driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/progress"));

        elements.clickTab("LeftMenuPage.mealPlanner");
//        if (driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/mealplan"))
//            System.out.println("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
//        else
//            System.out.println(errorMsg);
        Assert.assertTrue(driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/mealplan"));

        elements.clickTab("LeftMenuPage.albums");
//        if (driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/albums/user4"))
//            System.out.println("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
//        else
//            System.out.println(errorMsg);
        Assert.assertTrue(driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/albums/user4"));

        elements.clickTab("LeftMenuPage.articles");
//        if (driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/articles/step-1"))
//            System.out.println("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
//        else
//            System.out.println(errorMsg);
        Assert.assertTrue(driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/articles/step-1"));
    }
}
