package POM_PF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModalDialPOM_PF {


    private final WebDriver driver;




    public ModalDialPOM_PF(WebDriver driver){

       this.driver = driver;
    }



    @FindBy(id="showSmallModal")
    private WebElement smallModal ;
    @FindBy(id = "closeSmallModal")
    private WebElement closeSmallModal;
    @FindBy(id = "showLargeModal")
    private WebElement largeModal ;
    @FindBy(id = "closeLargeModal")
    private WebElement closeLargeModal;

    public void getStarted (){

       driver.get("https://demoqa.com/modal-dialogs");



    }

    public void openSmallModalWindow (){

        smallModal.click();



    }
    public void closeSmallWindows(){
        closeSmallModal.click();
    }
    public void openLargeModalWindow (){
        largeModal.click();




    }
    public void closeLargeModalWindow(){

        closeLargeModal.click();
        driver.close();
        driver.quit();

    }


}
