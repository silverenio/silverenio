package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

import java.util.concurrent.TimeUnit;

public class JournalTest {

    WebDriver driver;

    @BeforeTest
    public void setUpBefore(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void myTest(){
        SalesPage salesPage = new SalesPage(driver);
        salesPage.open();
        salesPage.goToLoginPage();


        LoginPage loginPage = new LoginPage(driver);

        UserLoggedInPage loggedInPage = loginPage.loginToTheAccount("user4", "user4");

        Assert.assertTrue(loggedInPage.isUserLoggedIn());
//                if (loggedInPage.isUserLoggedIn())
//                    System.out.println("<<< Login is SUCCESSFUL >>>");
//                else
//                 System.out.println("<<< Login FAILED >>>");

        JournalPage journalPage = new JournalPage(driver);
        UserHomePage userHomePage = new UserHomePage(driver);

        userHomePage.firstFlyOutCheck();
        if (userHomePage.firstFlyOutCheck())
            System.out.println("<<< 1st FlyOut is present >>>");
        else
            System.out.println("<<< 1st FlyOut is already ABSENT >>>");

        userHomePage.secondFlyOutCheck();
        if (userHomePage.secondFlyOutCheck())
            System.out.println("<<< 2nd FlyOut is present >>>");
        else
            System.out.println("<<< 2nd FlyOut is already ABSENT >>>");

        userHomePage.thirdFlyOutCheck();
        if (userHomePage.thirdFlyOutCheck())
            System.out.println("<<< 3rd FlyOut is present >>>");
        else
            System.out.println("<<< 3rd FlyOut is already ABSENT >>>");

        journalPage.openJournal();


        System.out.println("<<< THE TEST is FINISHED >>>");
    }

    @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();
    }


}
