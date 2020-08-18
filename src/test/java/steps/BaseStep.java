package steps;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.ProfilePage;

public class BaseStep {
    private static WebDriver driver;
    protected HomePage homePage;

    public BaseStep(){ }

    public static void setDriver(WebDriver driver){
        BaseStep.driver = driver;
    }

    public void launchApp(){
        driver.get("https://nfl.com/");
        //homePage = new HomePage(driver);
    }

    public HomePage getHomePage(){
        return new HomePage(driver);
    }

    public ProfilePage myProfilePage(){
        return new ProfilePage(driver);
    }

    //public MyNetworkPage myNetworkPage(){
    //    return new MyNetworkPage(driver);
    // }

}
