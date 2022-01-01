package master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class InitialSuiteSetup {

    protected WebDriver driver;

    @BeforeClass
    public void setupBrowser() {
        String user_dir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", user_dir + "/chromedriver 2");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
}
