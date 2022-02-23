package Tests;

import Pages.TextBox;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import master.InitialSuiteSetup;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import util.RestAPI;
import util.UIHelper;

import java.util.concurrent.TimeUnit;

public class TextBoxPageTests extends InitialSuiteSetup {

    UIHelper helper = new UIHelper();

    @BeforeClass
    public void BeforeClass() {
        System.out.println("Okay start muzik");
    }

    @Test
    public void Test1()  {
        TextBox t = PageFactory.initElements(driver, TextBox.class);
        driver.get("https://demoqa.com/text-box");
        helper.sendKeys(driver, "Yashwanth", 10, t.fullName);
        helper.sendKeys(driver,"Yashwanth@gmail.com", 15, t.email);
        helper.sendKeys(driver, "Yashwanthillu", 20, t.presentAddress);
        helper.sendKeys(driver,"Yashwanthsonthillu",25,  t.permanentAddress);
        helper.click(driver,10, t.submitButton);
        Assert.assertEquals(driver.getTitle(), "ToolsQA");
        //jsDriver.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Title matched!\"}}");
        RestAPI rest = new RestAPI();
        String apiResponse = rest.getApiResponse("http://dummy.restapiexample.com/api/v1/employees");
        System.out.println(apiResponse);
        Gson gson = new Gson();
        JsonObject responseJSON = gson.fromJson(apiResponse, JsonObject.class);
        Assert.assertEquals(responseJSON.get("status").getAsString(), "success", "The Status is not success");
    }

}
