package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseUtil {

    private  BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void ItitializeTest(){
        System.out.println("Opening the browser MOCK");
        base.StepInfo = "Firefox";
    }

    @After
    public void TearDownTest(Scenario scenario){
        if (scenario.isFailed()) {
            // screenshot
            System.out.println("failed" + scenario);
        }
        System.out.println("Closing the browser MOCK");
    }
}