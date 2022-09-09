package ReusableMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
  public WebDriver driver;
  public PageObjects(WebDriver driver) {
    this.driver=driver;
    PageFactory.initElements(driver, this);
  }

  @FindBy(how = How.XPATH, using = "//input[@id='txtUsername']")  WebElement username;
  @FindBy(how = How.XPATH, using = "//input[@id='txtPassword']") WebElement password;
  @FindBy(how = How.XPATH, using = "//div[@id='btnLoginSubmit']")  WebElement signIn;
  @FindBy(how = How.XPATH, using = "//iframe[@id='ifrMain']")  WebElement frame;
  @FindBy(how = How.XPATH, using = "//iframe[id='ifrMain']")  WebElement buttonAddframe;
  @FindBy(how = How.XPATH, using = "//div[@original-title='Module C2']")  WebElement moduleC2;
  @FindBy(how = How.XPATH, using = "//div[text()='Add']")  WebElement addButton;
  @FindBy(how = How.XPATH, using = "//li[@id='tab_B6FDEB7C-B09B-46D0-8302-FE1AEFC56742']")  WebElement moduleSources;
  @FindBy(how = How.XPATH, using = "//li[@id='tab_9C510EF3-B217-4AEC-A83E-92B4C95DEDE3']")  WebElement moduleA2Specific;
  @FindBy(how = How.XPATH, using = "(//i[@class='jstree-icon jstree-checkbox' and @role='presentation'])[29]")  WebElement A2_1;
  @FindBy(how = How.XPATH, using = "(//i[@class='jstree-icon jstree-checkbox' and @role='presentation'])[31]")  WebElement A2_2;
  @FindBy(how = How.XPATH, using = "(//i[@class='jstree-icon jstree-checkbox' and @role='presentation'])[33]")  WebElement A2_3;
  @FindBy(how = How.XPATH, using = "(//i[@class='jstree-icon jstree-checkbox' and @role='presentation'])[35]")  WebElement A2_4;
  @FindBy(how = How.XPATH, using = "(//div[@title='Save'])[2]")  WebElement saveButton;
  @FindBy(how = How.XPATH, using = "//a[@class='item logout']")  WebElement logOut;


  public WebElement username(){
    return username;
  }
  public WebElement password(){
    return password;
  }
  public WebElement signIn(){
    return signIn;
  }
  public WebElement frame(){
    return frame;
  }
  public WebElement buttonAddframe(){
    return buttonAddframe;
  }
  public WebElement moduleC2(){
    return moduleC2;
  }
  public WebElement addButton(){return addButton;}
  public WebElement moduleSources(){
    return moduleSources;
  }
  public WebElement moduleA2Specific(){
    return moduleA2Specific;
  }
  public WebElement A2_1(){
    return A2_1;
  }
  public WebElement A2_2(){
    return A2_2;
  }
  public WebElement A2_3(){
    return A2_3;
  }
  public WebElement A2_4(){
    return A2_4;
  }
  public WebElement saveButton(){
    return saveButton;
  }
  public WebElement logOut(){
    return logOut;
  }

}
