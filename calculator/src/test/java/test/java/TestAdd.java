package test.java;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources/testAdd.feature",glue="test.java.stepDefinition",monochrome=true)
public class TestAdd {

    public class testAdd {

    }

}
