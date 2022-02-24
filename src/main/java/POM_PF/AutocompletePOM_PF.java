package POM_PF;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AutocompletePOM_PF {



   private final WebDriver driver;

    public AutocompletePOM_PF(WebDriver driver){
        this.driver = driver;
    }
//////// WEB ELEMENT WEB ELEMENT WEB ELEMENT WEB ELEMENT WEB ELEMENT WEB ELEMENT WEB ELEMENT WEB ELEMENT WEB ELEMENT WEB ELEMENT ////////
    @FindBy(id = "autocomplete" )
    private WebElement EnterAddress ;
    @FindBy(id = "street_number")
    private WebElement StrAddress;
    @FindBy(id = "route")
    private WebElement StrAddress2;
    @FindBy(id="locality")
    private  WebElement locality;
    @FindBy(id="administrative_area_level_1")
    private WebElement STATE ;
    @FindBy(id="postal_code")
    private WebElement postalCode;
    @FindBy(id="country")
    private WebElement COUNTRY;







    //////// WEB ELEMENT WEB ELEMENT WEB ELEMENT WEB ELEMENT WEB ELEMENT WEB ELEMENT WEB ELEMENT WEB ELEMENT WEB ELEMENT WEB ELEMENT ////////

    public void openWebSite() {
        driver.get("https://formy-project.herokuapp.com/autocomplete");

    }
    public void UserSendAddressStrAddressAddress2 (String address,String strAddress ,String Address2){
        EnterAddress.sendKeys(address);
        StrAddress.sendKeys(strAddress);
        StrAddress2.sendKeys(Address2);

    }

    public void userSendAnotherData(String city ,String state ,String zipcode,String country){
    locality.sendKeys(city);
    STATE.sendKeys(state);
    postalCode.sendKeys(zipcode);
    COUNTRY.sendKeys(country);
    }
    public void SendEnter(){
        driver.close();
        driver.quit();

    }


}
