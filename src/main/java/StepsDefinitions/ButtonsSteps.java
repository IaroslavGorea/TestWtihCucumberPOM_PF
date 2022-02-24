package StepsDefinitions;

import POM_PF.ButtonsPOM_PF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ButtonsSteps {

    WebDriver driver;
    ButtonsPOM_PF actio ;


    @Given("User Open Web Site")
    public void user_open_web_site() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Don Nikitos\\Desktop\\TestForCV\\src\\main\\java\\pathDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(10000,TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();

        actio = PageFactory.initElements(driver,ButtonsPOM_PF.class);
        actio.OpenWebSiteWithButtons();

    }
    @When("User send double click")
    public void user_send_double_click() {
        actio.doubleClickBtn();

    }
    @Then("User send rigth click")
    public void user_send_rigth_click() {
        actio.rightClickBtn();

    }
    @And("User send click")
    public void user_send_click() {
    actio.justClick();
    }
}
