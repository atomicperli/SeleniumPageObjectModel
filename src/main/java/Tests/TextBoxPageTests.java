package Tests;

import Pages.TextBox;
import master.InitialSuiteSetup;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import util.UIHelper;

import java.util.concurrent.TimeUnit;

public class TextBoxPageTests extends InitialSuiteSetup {

    UIHelper helper = new UIHelper();

    @BeforeClass
    public void BeforeClass() {
        System.out.println("Okay start muzik");
    }

    @Test
    public void Test1() throws InterruptedException {
        TextBox t = new TextBox(driver);
        driver.get("https://demoqa.com/text-box");


        helper.sendKeys(driver, "Yashwanth", 10, t.fullName);

        helper.sendKeys(driver,"Yashwanth@gmail.com", 15, t.email);

        helper.sendKeys(driver, "Yashwanthillu", 20, t.presentAddress);

        helper.sendKeys(driver,"Yashwanthsonthillu",25,  t.permanentAddress);

        helper.click(driver,10, t.submitButton);
    }

}
