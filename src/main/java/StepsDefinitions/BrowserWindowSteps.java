package StepsDefinitions;

import POM_PF.BrowserWindowPOM_PF;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BrowserWindowSteps  {
    WebDriver driver;
    BrowserWindowPOM_PF open;
    @Given("User open page")
    public void user_open_page() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Don Nikitos\\Desktop\\TestForCV\\src\\main\\java\\pathDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(10000,TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();

         open = PageFactory.initElements(driver,BrowserWindowPOM_PF.class);

        open.openPage();

    }
    @When("User click new tab")
    public void user_click_new_tab() {
        open.openNewTab();

    }
    @Then("User click new window")
    public void user_click_new_window() {
    open.openNewWindow();
    }
    @And("user click new window message")
    public void user_click_new_window_message() {
    open.newWidnowsMessage();
    }




}
