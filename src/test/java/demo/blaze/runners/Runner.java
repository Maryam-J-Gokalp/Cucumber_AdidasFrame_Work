package demo.blaze.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber-report.json",
                "rerun:target/cucumber.txt"
        },
        features = "src/test/resources/features",
        glue = "demo/blaze/stepDefinitions",
        dryRun = false,
        tags = ""

)



public class Runner {
}
