package StepDefinations;

import ReusableMethods.BaseClass;
import ReusableMethods.PageObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class IsoMetrixLogin extends BaseClass {


  @Given("^User Navigates to isometrix site$")
  public void userNavigatesToIsometrixSiteAs() throws Throwable {
    openBrowser("edge");
  }

  @When("^User login using valid \"([^\"]*)\" and \"([^\"]*)\"$")
  public void userLoginUsingValidAnd(String username, String password)  throws Throwable{
    PageObjects pageObjects = new PageObjects(driver);
    //clear the username and password fields
    pageObjects.username().clear();
    pageObjects.password().clear();
    //input Username
    pageObjects.username().sendKeys(username);
    //Input Password
    pageObjects.password().sendKeys(password);
    //Click Submit Button
    getScreenShotPath("Login Page",driver);
    pageObjects.signIn().click();
    Thread.sleep(2000);
    getScreenShotPath("Home page",driver);
  }

}
