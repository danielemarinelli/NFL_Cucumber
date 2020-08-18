package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private By btnSignin =By.xpath("(.//span[contains(text(),'Sign')])[2]/..");
    private By btnAgree = By.xpath(".//button[text()=\"Agree\"]");
    private By display = By.xpath(".//h2[contains(text(),'Sign')]");
    private By userField = By.xpath(".//input[@id='gigya-loginID-60062076330815260']");
    private By passField = By.xpath(".//input[@id='gigya-password-85118380969228590']");


    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public String clickOnSignin() throws Exception {
        driver.findElement(btnSignin).click();
        Thread.sleep(2000);
        driver.findElement(btnAgree).click();
        String message=driver.findElement(display).getText();
        return message;
    }

    public void insertCredentials(String user, String pass){
        driver.findElement(btnSignin).click();
        driver.findElement(userField).sendKeys(user);
        driver.findElement(passField).sendKeys(pass);

    }

}
