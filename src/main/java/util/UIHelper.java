package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UIHelper {

    public void sendKeys(WebDriver driver, String value, int waitTime, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(value);
    }

    public void click(WebDriver driver, int waitTime, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
}
