package hellocucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"pretty"},tags = {"@v1.0.0","not @santai"})
@CucumberOptions(plugin = {"pretty"})
public class RunCucumberTest {
}