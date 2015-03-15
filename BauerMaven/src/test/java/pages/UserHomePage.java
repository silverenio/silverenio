package pages;


import junit.framework.Assert;
import libs.WebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class UserHomePage {

    WebDriver driver;
    WebElements elements;
    WebDriverWait waitForConditions;

    public UserHomePage(WebDriver driver) {
        this.driver=driver;
        elements = new WebElements(driver);
    }

    String errorMsg = "<<< FAILED, link is incorrect >>>";


    public  boolean firstFlyOutCheck(){
        try {
//            waitForConditions = new WebDriverWait(driver, 5);
//            waitForConditions.until(ExpectedConditions.visibilityOfElementLocated(ui("UserHomePage.firstNextButton")));
            WebElement element = driver.findElement(By.xpath("UserHomePage.firstNextButton"));
            Actions actions = new Actions(driver);
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            actions.moveToElement(element).click().perform();
            return true;
        } catch (NoSuchElementException exception){
            return false;
        }
    }

    public boolean secondFlyOutCheck(){
        try {
//            waitForConditions = new WebDriverWait(driver, 5);
//            waitForConditions.until(ExpectedConditions.visibilityOfElementLocated(ui("UserHomePage.secondNextButton")));
            WebElement element = driver.findElement(By.xpath("UserHomePage.secondNextButton"));
            Actions actions = new Actions(driver);
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            actions.moveToElement(element).click().perform();
            return true;
        } catch (NoSuchElementException exception){
            return false;
        }
    }

    public boolean thirdFlyOutCheck(){
        try {
//            waitForConditions = new WebDriverWait(driver, 5);
//            waitForConditions.until(ExpectedConditions.visibilityOfElementLocated(ui("UserHomePage.allDoneButton")));
            WebElement element = driver.findElement(By.xpath("UserHomePage.secondNextButton"));
            Actions actions = new Actions(driver);
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            actions.moveToElement(element).click().perform();
            return true;
        } catch (NoSuchElementException exception){
            return false;
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
