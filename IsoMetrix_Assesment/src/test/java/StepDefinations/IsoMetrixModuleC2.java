package StepDefinations;

import ReusableMethods.BaseClass;
import ReusableMethods.PageObjects;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class IsoMetrixModuleC2 extends BaseClass {

  @And("^User Navigate to \"([^\"]*)\" page$")
  public void userNavigateToPage(String pageName) throws InterruptedException, IOException {
    PageObjects pageObjects = new PageObjects(driver);


    switch (pageName) {
      case "Module C2":
        driver.switchTo().frame(pageObjects.frame());
        pageObjects.moduleC2().click();
        driver.switchTo().defaultContent();

        break;
      case "Module Sources":
        Thread.sleep(2000);
        pageObjects.moduleSources().click();
        break;

      case "Module A2 - Specific":
        pageObjects.moduleA2Specific().click();
        break;
    }
  }
  @Then("^User Clicks on \"([^\"]*)\" button$")
  public void userClicksOnButton(String buttonName) throws InterruptedException, IOException {
    PageObjects pageObjects = new PageObjects(driver);
    switch (buttonName) {
      case "Add":
        Thread.sleep(2000);
        driver.switchTo().frame(pageObjects.frame());
        pageObjects.addButton().click();
        break;
      case "Save":
        pageObjects.saveButton().click();
        getScreenShotPath("Saved data",driver);
        break;
      case "Logout":
        driver.switchTo().defaultContent();
        pageObjects.logOut().click();
        getScreenShotPath("Logut Page",driver);
        break;
    }
  }

  @And("^User Clicks on \"([^\"]*)\" check box$")
  public void userClicksOnCheckBox(String checkbutton) throws InterruptedException {
    PageObjects pageObjects = new PageObjects(driver);
    switch (checkbutton) {
      case "A2 Column 1":
        Thread.sleep(2000);
        pageObjects.A2_1().click();
        break;
      case "A2 Column 2":
        pageObjects.A2_2().click();
        break;
      case "A2 Column 3":
        pageObjects.A2_3().click();
        break;
      case "A2 Column 4":
        pageObjects.A2_4().click();
        break;
    }
  }
}