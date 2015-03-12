package libs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static libs.ConfigData.ui;

/*
 * This class implements methods to work with default web-elements
 **/
public class WebElements {
    private WebDriver driver;

    public WebElements(WebDriver driver) {
        this.driver = driver;
    }

    /*
    * This method is used to input some text into some field.
     */
    public void inputText(String fieldLocator, String text){
        WebElement inputField;
        inputField = driver.findElement(ui(fieldLocator));
        inputField.clear();
        inputField.sendKeys(text);
        System.out.println("<"+text+">" + " inputted into field with locator <" + fieldLocator + ">.");
        //driver.findElement(By.xpath(fieldLocator)).clear();
        //driver.findElement(By.xpath(fieldLocator)).sendKeys(text);
    }

    /*
    * This method is used to click the button
     */
    public void clickButton(String buttonLocator){
        WebElement button;
        button = driver.findElement(ui(buttonLocator));
        button.click();
        System.out.println("Button with locator <" + buttonLocator + "> was clicked.");
    }

    /*
    * This method is used to click the tab
     */
    public void clickTab(String tabLocator){
        WebElement tab;
        tab = driver.findElement(ui(tabLocator));
        tab.click();
        System.out.println("Tab with locator <" + tabLocator + "> was clicked.");
    }


    /*
    * This method is used to click on some link.
    */
    public void clickLink(String linkText){
        WebElement link;
        link = driver.findElement(ui(linkText));
        link.click();
        System.out.println("Link with locator <" + linkText + "> was clicked.");
    }
    /*
    * This method is used to select or deselect checkbox
     */
    public void selectCheckBox(String checkBoxLocator, boolean checkBoxState){
        WebElement checkBox;
        checkBox = driver.findElement(ui(checkBoxLocator));
        boolean currentState;
        currentState = checkBox.isSelected();
        if (currentState && checkBoxState){
            System.out.println("Checkbox is already selected.");
        }else if (!currentState && checkBoxState) {
            checkBox.click();
            System.out.println("Checkbox has been selected.");
        }else if (!currentState && !checkBoxState) {
            System.out.println("CheckBox isn't selected.");
        }else if (currentState && !checkBoxState){
            checkBox.click();
            System.out.println("CheckBox has been unselected.");
        }
    }
    /*
    * This method is used to clear required field.
     */
    public void clearField(String fieldLocator){
        WebElement inputField;
        inputField = driver.findElement(ui(fieldLocator));
        inputField.clear();
        System.out.println("Field with locator <" + fieldLocator + "> has been successfully cleared.");
    }

    public void selectRadioButton (String radioButtonBlockLocator, boolean radioButtonState){
        WebElement radioButtonBlock;
        radioButtonBlock = driver.findElement(ui(radioButtonBlockLocator));
        boolean currentState;


    }
    /*
    * This method is used to choose element from drop-down list.
     */
    public void selectDropDownElement (String dropDownElementLocator){
        WebElement dropDownElement;

        dropDownElement = driver.findElement(ui(dropDownElementLocator));
        dropDownElement.click();
        System.out.println("Drop-down element with locator <" + dropDownElementLocator +"> has been successfully chosen.");


    }



}


