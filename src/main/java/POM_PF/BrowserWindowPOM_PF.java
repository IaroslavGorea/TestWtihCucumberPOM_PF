package POM_PF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrowserWindowPOM_PF {


   private WebDriver driver ;

    public BrowserWindowPOM_PF(WebDriver driver){

        this.driver=driver;


    }



    @FindBy(xpath = "//*[@id=\"tabButton\"]")
    private WebElement newTab;
    @FindBy(xpath = "//*[@id=\"windowButton\"]")
    private WebElement newWindow ;
    @FindBy(xpath = "//*[@id=\"messageWindowButton\"]")
    private WebElement newWindosMessage ;

    public void openPage (){
        driver.get("https://demoqa.com/browser-windows");
    }

    public void openNewTab (){

        newTab.click();


    }
    public void  openNewWindow(){
        newWindow.click();

    }
    public void newWidnowsMessage(){
        newWindosMessage.click();
        driver.close();
        driver.quit();
    }
}
