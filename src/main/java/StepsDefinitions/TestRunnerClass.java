package StepsDefinitions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Features",glue={"StepsDefinitions"},

        plugin = { "pretty", "json:target/Cucumber.json",
                "junit:target/Cucumber.xml",
                "html:target/cucumber.HTML"},
        monochrome = true



)

public class TestRunnerClass {
}



    // plugin = { "pretty", "json:target/Cucumber.json",
            // "junit:target/Cucumber.xml",
           //  "html:target/cucumber.HTML",},