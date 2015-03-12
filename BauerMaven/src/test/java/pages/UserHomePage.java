package pages;


import libs.WebElements;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class UserHomePage {

    WebDriver driver;
    WebElements elements;

    public UserHomePage(WebDriver driver) {
        this.driver=driver;
        elements = new WebElements(driver);
    }

    String errorMsg = "<<< FAILED, link is incorrect >>>";


    public  boolean firstFlyOutCheck(){
        try {
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            elements.clickButton("UserHomePage.firstNextButton");
            return true;
        } catch (NoSuchElementException exception){
            return false;

        }
    }

    public boolean secondFlyOutCheck(){
        try {
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            elements.clickButton("UserHomePage.secondNextButton");
            return true;
        } catch (NoSuchElementException exception){
            return false;
        }
    }

    public boolean thirdFlyOutCheck(){
        try {
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            elements.clickButton("UserHomePage.allDoneButton");
            return true;
        } catch (NoSuchElementException exception){
            return false;
        }
    }


    public void clickTabs () {

        elements.clickTab("LeftMenuPage.home");
        if (driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/home"))
            System.out.println("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
        else
            System.out.println(errorMsg);


        elements.clickTab("LeftMenuPage.meals");
        if (driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/meals"))
            System.out.println("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
        else
            System.out.println(errorMsg);

        elements.clickTab("LeftMenuPage.schedule");
        if (driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/schedule"))
            System.out.println("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
        else
            System.out.println(errorMsg);

        elements.clickTab("LeftMenuPage.shoppingList");
        if (driver.getCurrentUrl().contains("grocery-list"))
            System.out.println("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
        else
            System.out.println(errorMsg);

        elements.clickTab("LeftMenuPage.journal");
        if (driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/myjournal/user4"))
            System.out.println("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
        else
            System.out.println(errorMsg);

        elements.clickTab("LeftMenuPage.calorieLog");
        if (driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/calorie-log"))
            System.out.println("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
        else
            System.out.println(errorMsg);

        elements.clickTab("LeftMenuPage.progress");
        if (driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/progress"))
            System.out.println("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
        else
            System.out.println(errorMsg);

        elements.clickTab("LeftMenuPage.mealPlanner");
        if (driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/mealplan"))
            System.out.println("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
        else
            System.out.println(errorMsg);

        elements.clickTab("LeftMenuPage.albums");
        if (driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/albums/user4"))
            System.out.println("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
        else
            System.out.println(errorMsg);

        elements.clickTab("LeftMenuPage.articles");
        if (driver.getCurrentUrl().equals("https://bauer.exercise-staging.com/articles/step-1"))
            System.out.println("Link: "+driver.getCurrentUrl()+" has been successfully opened.");
        else
            System.out.println(errorMsg);
    }
}
