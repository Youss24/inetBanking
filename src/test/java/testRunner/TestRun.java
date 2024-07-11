package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = "Features/Customers.feature",
                glue = "StepsDefinitions",
                dryRun = false,
                monochrome = true,
                plugin = {"pretty",
                        "html:target/reports/report.html",
                        "json:target/reports/report.json"}
        )
public class TestRun {

}
