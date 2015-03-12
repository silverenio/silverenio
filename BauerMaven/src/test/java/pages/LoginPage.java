package pages;

import libs.WebElements;
import org.openqa.selenium.WebDriver;


public class LoginPage {

    WebDriver driver;
    WebElements elements;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        elements = new WebElements(driver);
    }
//    private static By usernameInput = By.xpath("//input[@id='_username']");
//    private static By passwordInput = By.xpath("//input[@id='_password']");
//    private static By enterButton = By.xpath("//button[@class='super action arrow']");

    public UserLoggedInPage loginToTheAccount(String username, String password){
//        driver.findElement(emailInput).clear();
//        driver.findElement(emailInput).sendKeys(email);

        elements.inputText("LoginPage.loginField", username);

//        driver.findElement(passwordInput).clear();
//        driver.findElement(passwordInput).sendKeys(password);

        elements.inputText("LoginPage.passField", password);

//        driver.findElement(enterButton).click();

        elements.clickButton("LoginPage.loginButton");

        return new UserLoggedInPage(driver);

    }

}

