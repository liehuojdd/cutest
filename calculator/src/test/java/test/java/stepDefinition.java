package test.java;

import com.calculator.Calculator;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class stepDefinition {
        Calculator cal;
        int result;
        @Given("^init the object of calculator$")
        public void given() throws Throwable {
            cal= new Calculator();
        }

        @When("^clear the result to zero$")
        public void when() throws Throwable {
            cal.clear();
        }

        @And("^add (.*) and (.*)$")
        public void and(int a,int b) throws Throwable {
            cal.add(a);
            cal.add(b);
        }

        @Then("^check the actual result (.*)$")
        public void then(int expected) throws Throwable {
            result = cal.getResult();
            assertEquals(expected,result);
        }


    }
