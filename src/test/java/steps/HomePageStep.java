package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageStep extends BaseStep{
    @Given("^I navigate to NFL$")
    public void iNavigateToNFL() {

    }

    @When("^I click on signin$")
    public void iClickOnSignin() throws Exception {
        launchApp();
        getHomePage().clickOnSignin();
        //Assert.assertEquals("Sign In to your NFL Account", homePage.clickOnSignin());
    }

    @And("^I insert my (.*?) and (.*?)$")
    public void iInsertTheMyUserAndPassword(String username, String password) {
        getHomePage().insertCredentials(username,password);
        //System.out.println("You are not loggin. Invalid user and password");

    }

}
