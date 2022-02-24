package POM_PF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPOM_PF {
    private final WebDriver driver;

    public TextBoxPOM_PF(WebDriver driver){
        this.driver = driver ;
    }

    @FindBy(linkText = "https://demoqa.com/text-box")
    private WebElement linkWebSite;
    @FindBy(id="userName")
    private WebElement userName;
    @FindBy(id="userEmail")
    private WebElement userEmail;
    @FindBy(id="currentAddress")
    private WebElement CurrentAddress ;
    @FindBy(id="permanentAddress")
    private WebElement PermanentAddress ;
    @FindBy(id="submit")
    private WebElement button ;




    public void openWebSite (){
        driver.get("https://demoqa.com/text-box");

    }

    public void sendTXT (String name ,String email ,String currentAddress,String premanentAddress){

        userName.sendKeys(name);
        userEmail.sendKeys(email);

        CurrentAddress.sendKeys(currentAddress);
        PermanentAddress.sendKeys(premanentAddress);
    }
    public void pressButton(){
        button.click();
        driver.close();
        driver.quit();

    }
}
