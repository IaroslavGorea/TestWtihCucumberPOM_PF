package POM_PF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class ButtonsPOM_PF {

    private Actions action;
    private WebDriver driver;

    public ButtonsPOM_PF (WebDriver driver){
        this.driver = driver ;
         action = new Actions(driver);
    }


//Actions action = new Actions(driver);

    @FindBy(id = "doubleClickBtn")
    private WebElement dB ;
    @FindBy(id = "rightClickBtn")
    private WebElement rC ;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button")
    private WebElement cM ;


    public void OpenWebSiteWithButtons (){
        driver.get("https://demoqa.com/buttons");

    }

    public void doubleClickBtn (){
        action.doubleClick(dB).build().perform();
    }
    public void rightClickBtn (){
        action.contextClick(rC).build().perform();
    }
    public void justClick (){
        action.click(cM).build().perform();
        driver.close();
        driver.quit();
    }



}
