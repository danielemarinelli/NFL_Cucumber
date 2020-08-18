package steps;

import io.cucumber.java.en.Then;

public class SigninPage extends BaseStep{

    @Then("I should be able to view my web page")
    public void iShouldBeAbleToViewMyWebPage() {
        System.out.println("You aren't a real user, so you won't be logged in");
    }
}
