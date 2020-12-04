//http://it.hzqiuxm.com/cucumber%E7%AE%80%E6%98%8E%E6%95%99%E7%A8%8B/
package hellocucumber;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import java.util.List;

import static org.junit.Assert.*;

public class Stepdefs {
    int result=0;
    int x=0;
    int y=0;

    @Given("^x and y value$")
    public void x_and_y_value() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Given("^x is (\\d+) and y is (\\d+)$")
    public void x_is_and_y_is(int arg1, int arg2) throws Exception {
        result=arg1+arg2;
    }

    @When("^invoke add Method$")
    public void invoke_add_Method() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^the result is (\\d+)$")
    public void the_result_is(int arg1) throws Exception {
        assertEquals(arg1,result);
    }


    @Given("^sub operation$")
    public void sub_operation() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^invoke calculate button$")
    public void invoke_calculate_button() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^the result is x-y$")
    public void the_result_is_x_y() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    //Test2

    @Given("^the user account infomation$")
    public void the_user_account_infomation() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^we can found user \"([^\"]*)\", with password \"([^\"]*)\", phone \"([^\"]*)\"$")
    public void we_can_found_user_with_password_phone(String arg1, String arg2, String arg3) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Given("^use complex data$")
    public void use_complex_data() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^verify user account info$")
    public void verify_user_account_info(DataTable arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        for(List<String> list2:arg1.raw()){
            String a="";
        }

    }

    //Test3

    @Given("^public steps with Scenario Outline$")
    public void public_steps_wit_Scenario_Outline() throws Exception {
        System.out.println("public step");
    }

    @When("^use failed \"([^\"]*)\" and \"([^\"]*)\" to login$")
    public void use_failed_and_to_login(String arg1, String arg2) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^return failed$")
    public void return_failed() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^use right \"([^\"]*)\" and \"([^\"]*)\" to login$")
    public void use_right_and_to_login(String arg1, String arg2) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^return pass$")
    public void return_pass() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }



}