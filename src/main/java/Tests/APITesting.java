package Tests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import util.RestAPI;

public class APITesting {

    public static void main(String[] args) {
        RestAPI rest = new RestAPI();
        String apiResponse = rest.getApiResponse("http://dummy.restapiexample.com/api/v1/employees");
        System.out.println(apiResponse);
        Gson gson = new Gson();
        JsonObject responseJSON = gson.fromJson(apiResponse, JsonObject.class);
        System.out.println(responseJSON.get("status").getAsString());
    }
}
