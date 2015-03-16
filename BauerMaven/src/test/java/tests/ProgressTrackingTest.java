package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

import java.util.concurrent.TimeUnit;


public class ProgressTrackingTest {

    WebDriver driver;

    @BeforeClass
    public void setUpBefore(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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


        ProgressPage progressPage = new ProgressPage(driver);
        UserHomePage userHomePage = new UserHomePage(driver);

        userHomePage.firstFlyOutCheck();
        userHomePage.secondFlyOutCheck();
        userHomePage.thirdFlyOutCheck();

        progressPage.setTheGraph();
        progressPage.trackWeight();

        System.out.println("<<< THE TEST is FINISHED >>>");
    }

    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }


}
