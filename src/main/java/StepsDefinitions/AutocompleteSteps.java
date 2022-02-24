package StepsDefinitions;

import POM_PF.AutocompletePOM_PF;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class AutocompleteSteps   {
    WebDriver driver;
    AutocompletePOM_PF autocomlete;

    @Given("WebSite is open")
    public void web_site_is_open() {
        //String pathDriver = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Don Nikitos\\Desktop\\TestForCV\\src\\main\\java\\pathDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(10000,TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();


        autocomlete = PageFactory.initElements(driver,AutocompletePOM_PF.class);
        autocomlete.openWebSite();


    }
    @When("^user send her (.*) (.*) (.*) data in empty field$")
    public void user_send_her_moldova_stefan_cel_mare_cel_mare_si_sfint_data_in_empty_field(String address,String strAddress ,String Address2) {
        autocomlete.UserSendAddressStrAddressAddress2(address,strAddress,Address2);


    }
    @And("^user send another data (.*) and (.*) and (.*) and (.*)$")
    public void user_send_another_data_chisinau_and_state_and_md_and_moldova(String city ,String state ,String zipcode ,String country ) {
        autocomlete.userSendAnotherData(city, state, zipcode, country);

    }
    @Then("user send enter")
    public void user_send_enter() {

    }
}
