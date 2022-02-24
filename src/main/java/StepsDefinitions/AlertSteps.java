package StepsDefinitions;

import POM_PF.AlertsPOM_PF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class AlertSteps  {

    WebDriver driver;
    AlertsPOM_PF getStr ;



    @Given("WedPage is Open")
    public void wed_page_is_open() {

         System.setProperty("webdriver.chrome.driver","C:\\Users\\Don Nikitos\\Desktop\\TestForCV\\src\\main\\java\\pathDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(10000,TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();


     getStr = PageFactory.initElements(driver,AlertsPOM_PF.class);
     getStr.getStarted();
    }
    @When("User Click Button to see alert")
    public void user_click_button_to_see_alert() {
     getStr.alBtn();

    }
    @Then("User click alert will appear after  seconds")
    public void user_click_alert_will_appear_after_seconds()throws InterruptedException {
        getStr.timeAlBtn();

    }
    @And("User click confirm box will appear")
    public void user_click_confirm_box_will_appear() {
     getStr.confBtn();

    }
    @Then("User click prompt box will appear")
    public void user_click_prompt_box_will_appear() {
     getStr.prompBtn();

    }
}
