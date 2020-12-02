package test.java;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

    @Before
    public void beforeScenario() {
        System.out.println("Start Scenario");
    }

    @After
    public void aftereScenario() {
        System.out.println("Stop Scenario");
    }

}
