package StepsDefinitions;

import POM_PF.ModalDialPOM_PF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ModalDialSteps {

    WebDriver driver;
    ModalDialPOM_PF action ;


        @Given("User click window")
        public void user_click_window() {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Don Nikitos\\Desktop\\TestForCV\\src\\main\\java\\pathDriver\\chromedriver.exe");
            driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
            driver.manage().timeouts().pageLoadTimeout(10000,TimeUnit.MILLISECONDS);
            driver.manage().window().maximize();

            action = PageFactory.initElements(driver,ModalDialPOM_PF.class);
            action.getStarted();
            action.openSmallModalWindow();


}
    @And("User close window")
    public void user_close_window() {
            action.closeSmallWindows();


    }
    @Then("User open second window")
    public void user_open_second_window() {
            action.openLargeModalWindow();

    }


}
