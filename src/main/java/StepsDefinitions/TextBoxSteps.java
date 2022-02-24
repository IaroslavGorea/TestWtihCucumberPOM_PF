package StepsDefinitions;

import POM_PF.TextBoxPOM_PF;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class TextBoxSteps  {
    WebDriver driver;
    TextBoxPOM_PF sendsDataToTextBox;


    @Given("WebSite demoqa.com\\/text-box is open")
    public void web_site_demoqa_com_text_box_is_open() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Don Nikitos\\Desktop\\TestForCV\\src\\main\\java\\pathDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(10000,TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();


        sendsDataToTextBox = PageFactory.initElements(driver,TextBoxPOM_PF.class);
        sendsDataToTextBox.openWebSite();

    }

    @When("^sends (.*) and (.*) and (.*) and (.*)$")
    public void sends_iaroslav_and_regaman101_gmail_com_and_chisinau_and_chisinau(String name ,String email,String currentAddress,String premanentAddress) {
        sendsDataToTextBox.sendTXT(name,email,currentAddress,premanentAddress);

    }

    @Then("user push submit")
    public void user_push_submit() {
        sendsDataToTextBox.pressButton();

    }

}
