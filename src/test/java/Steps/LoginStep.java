package Steps;

import Base.BaseUtil;
import Transformation.EmailTransformer;
import Transformation.SummTransformer;
import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
import java.util.List;

public class LoginStep extends BaseUtil{


    private  BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }


    @Given( "^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I navigate to the login page");
        System.out.println("***** the driver *****" + base.StepInfo);

    }


    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I click login button");
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I should see the userform page");

    }


    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I enter the following for Login" );
//        List<List<String>> data = table.raw();
//        System.out.println("value is " + data.get(0).get(0).toString());
//        System.out.println("value is " + data.get(1).get(0).toString());
        List<User> users = new ArrayList<User>();
        users = table.asList(User.class);

        for (User user: users) {
            System.out.println("username is " + user.username);
            System.out.println("password is " + user.password);

        }
    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String username, String password) throws Throwable {
        System.out.println("username is " + username);
        System.out.println("password is " + password);

    }

    @And("^I enter the user email address as Email:([^\"]*)")
    public void iEnterTheUserEmailAddressAsEmailAdmin(@Transform(EmailTransformer.class) String email) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("!!!!!!the admin address is " + email + "!!!!");
    }

    @And("^I verify num of digits UA (\\d+)$")
    public void iVerifyNumOfDigitsUA(@Transform(SummTransformer.class) int summ) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("!!!!!!the summ  is " + summ + "!!!!");
    }



    public class User
    {
        public User(String userName, String passWord) {
            username = userName;
            password = passWord;
        }
        public String username;
        public String password;


    }
}