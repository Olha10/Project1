import helpers.ElementsHelper;
import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Parameters;
import pages.*;

public class TestBase {
    WebDriver driver;
    ElementsHelper elementsHelper;
    public String testUrl = ("https://github.com/login");
    HeaderTabsLocators headerTabsLocators = new HeaderTabsLocators();
    ViewProfileDetailsMenuLocators viewProfileDetailsMenuLocators = new ViewProfileDetailsMenuLocators();

    @BeforeGroups(groups = "gitHubPages_tests")
    @Parameters("browser")
    public void setUp (Browsers browser){
        switch (browser) {
            case CHROME:
                ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case OPERA:
                OperaDriverManager.getInstance(DriverManagerType.OPERA).setup();
                driver = new OperaDriver();
                break;
            case EDGE:
                EdgeDriverManager.getInstance(DriverManagerType.EDGE).setup();
                driver = new EdgeDriver();
                break;
            default:
                throw new RuntimeException("Invalid specified browser:" + browser + ",expected one of 'CHROME', 'FIREFOX', 'OPERA', 'EDGE'");
        }
        elementsHelper = new ElementsHelper(driver);
        driver.get(testUrl);
        driver.manage().window().maximize();
    }

    @AfterGroups(groups = "gitHubPages_tests")
    public void SignOut() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabsLocators.profileAndMoreMenuButton, 10);
        elementsHelper.isElementPresent(viewProfileDetailsMenuLocators.signOutButton,10);
        elementsHelper.clickOnVisibleAndClickableElement(viewProfileDetailsMenuLocators.signOutButton,5);
        driver.quit();
    }

}

