package Steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by administrator on 3/29/17.
 */
public class LoginStep {
    @Given( "^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
        System.out.println("I navigate to the login page");

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
