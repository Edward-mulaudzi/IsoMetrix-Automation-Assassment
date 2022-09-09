package RunnerClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinations"},
monochrome = true,
        plugin = {"pretty", "junit:target/cucumber.xml",
                "html:target/local-cucumber-reports/",})
public class RunnerClass {
}
