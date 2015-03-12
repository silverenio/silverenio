package pages;

import libs.WebElements;
import org.openqa.selenium.WebDriver;


public class EditProfilePage {

    WebDriver driver;
    WebElements elements;

    public EditProfilePage(WebDriver driver) {
        this.driver=driver;
        elements = new WebElements(driver);
    }

    String errorMsg = "<<< FAILED, link is incorrect >>>";

    public void editProfile(){


        elements.clickLink("EditProfilePage.accountLink");
        elements.clickLink("EditProfilePage.editProfileLink");
        elements.inputText("EditProfilePage.inputFirstName", "Antonio");
        elements.inputText("EditProfilePage.inputLastName","Banderas");
        elements.inputText("EditProfilePage.inputLocation","HomeSweetHome");
        elements.inputText("EditProfilePage.inputZipCode","02002");
        elements.inputText("EditProfilePage.inputHomePage","https://www.youtube.com/watch?v=9bZkp7q19f0");
        elements.inputText("EditProfilePage.inputCurrentWeight", "230");
        elements.inputText("EditProfilePage.inputGoalWeight","190");
        elements.inputText("EditProfilePage.inputHeightFeet","5");
        elements.inputText("EditProfilePage.inputHeightInches","11");
        elements.inputText("EditProfilePage.inputOccupation","myOccupation");
        elements.inputText("EditProfilePage.inputAboutMe","Here I am, this is me, this is my small biography...");
        elements.clickButton("EditProfilePage.saveButton");



    }
}

