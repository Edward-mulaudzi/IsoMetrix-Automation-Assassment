package ReusableMethods;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class BaseClass {

  public static WebDriver driver = null;
  public static ExtentReports extent;
  public static ExtentTest test;

  public static void openBrowser(String browser){
    String url ="https://qa01.isometrix.net/IsoMetrix.Automation.Features/default.aspx";
    if(browser.equalsIgnoreCase("chrome")){
      WebDriverManager.chromedriver().setup();
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--incognito");
      driver = new ChromeDriver();
      driver.get(url);

    }
    else if(browser.equalsIgnoreCase("edge")){
      WebDriverManager.edgedriver().setup();
      driver = new EdgeDriver() ;
      driver.get(url);
      driver.manage().window().maximize();
    }
    else if(browser.equalsIgnoreCase("firefox")){
      WebDriverManager.firefoxdriver().setup();
      driver = new FirefoxDriver();
      driver.get(url);
      driver.manage().window().maximize();
    }
  }
  public String getScreenShotPath( String testCaseName, WebDriver driver) throws IOException
  {
    TakesScreenshot ts=(TakesScreenshot) driver;
    File source = ts.getScreenshotAs(OutputType.FILE);
    String destination =System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
    FileUtils.copyFile(source,new File(destination));
    return destination;
  }

}
