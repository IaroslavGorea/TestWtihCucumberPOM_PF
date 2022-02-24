package POM_PF;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class AlertsPOM_PF  {

    WebDriver driver;

    Alert alert ;


    public AlertsPOM_PF (WebDriver driver){
      this.driver=driver;

    }

    @FindBy(id="alertButton")
    private WebElement alertButton;
    @FindBy(id="timerAlertButton")
    private WebElement timerAlBtn;
    @FindBy(id="confirmButton")
    private WebElement confrimBtn;
    @FindBy(id="promtButton")
    private WebElement promptButton ;

    public void getStarted (){

        driver.get("https://demoqa.com/alerts");


    }

    public void alBtn (){
        alertButton.click();
        alert = (new WebDriverWait(driver, 5))//Создаю перменную alert ,которая дожидается повялнеия окна
                .until(ExpectedConditions.alertIsPresent());
        alert.accept();


    }
    public void timeAlBtn () throws InterruptedException {
        timerAlBtn.click();
        sleep(5000);
         alert.accept();






    }
    public void confBtn (){
        confrimBtn.click();

        alert.dismiss();


    }
    public void prompBtn (){

        promptButton.click();

        alert.sendKeys("123");

        alert.accept();
        driver.close();
        driver.quit();

    }


}
