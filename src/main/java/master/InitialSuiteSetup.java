package master;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;


public class InitialSuiteSetup {

    protected WebDriver driver;
    protected JavascriptExecutor jsDriver;
    public static final String USERNAME = "yashwanthperli_uxczPk";
    public static final String AUTOMATE_KEY = "ESuyqJJ27k7XPFFX2Nny";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    @BeforeClass
    public void setupBrowser() throws MalformedURLException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        String key;
//        DesiredCapabilities caps = new DesiredCapabilities();
//        // Iterate over the hashtable and set the capabilities
//        Hashtable<String, String> capsHashtable = new Hashtable<String, String>();
//        capsHashtable.put("browser", "chrome");
//        capsHashtable.put("browser_version", "latest");
//        capsHashtable.put("os", "Windows");
//        capsHashtable.put("os_version", "10");
//        capsHashtable.put("build", "browserstack-build-1");
//        capsHashtable.put("name", "Thread 1");
//        Set<String> keys = capsHashtable.keySet();
//        Iterator<String> itr = keys.iterator();
//        while (itr.hasNext()) {
//            key = itr.next();
//            caps.setCapability(key, capsHashtable.get(key));
//        }
//        driver = new RemoteWebDriver(new URL(URL), caps);
//        jsDriver = (JavascriptExecutor)driver;
    }
}
