package Steps;

import cucumber.api.java8.En;

public class StepJava8 implements En {
    public StepJava8() {
        And("^Step to check java (\\d+)$", (Integer arg0) -> {

        });
    }
}