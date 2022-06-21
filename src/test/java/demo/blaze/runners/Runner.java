package demo.blaze.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-report.html"
        },
        features = "src/test/resources/features",
        glue = "demo/blaze/stepDefinitions",
        dryRun = false,
        tags = "@wip"

)



public class Runner {
}
