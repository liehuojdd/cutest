package hellocucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

public class Stepdefs {
    private String today;
    private String actualAnswer;

//    @Given("^today is Sunday$")
//    public void today_is_Sunday() {
//        // Write code here that turns the phrase above into concrete actions
//        today = "Sunday";
//        //throw new PendingException();
//    }
//    @Given("^today is Friday$")
//    public void today_is_Friday() {
//        this.today = "Friday";
//    }

    @Given("^today is \"([^\"]*)\"$")
    public void today_is(String today) {
        this.today = today;
    }

    @When("^I ask whether it's Friday yet$")
    public void i_ask_whether_it_s_Friday_yet() {
        // Write code here that turns the phrase above into concrete actions
        actualAnswer = IsItFriday.isItFriday(today);
        //throw new PendingException();
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(expectedAnswer, actualAnswer);
        //throw new PendingException();
    }
}