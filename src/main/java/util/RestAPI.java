package util;

import org.json.simple.JSONObject;
import org.openqa.selenium.remote.http.HttpMethod;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.web.client.RestTemplate;

public class RestAPI {

    static String envHostName = null;
    static String chEnvHostName = null;

    public String getApiResponse(String url) {
        try {
            RestTemplate restTemplate = geRestTemplate();
            //restTemplate.getInterceptors().add(new BasicAuthorizationInterceptor(userName, userPassword));

            //retry fetching API response
            for (int retryCount = 1; retryCount <= 5; retryCount++) {
                try {
                    ResponseEntity<String> entity = restTemplate.getForEntity(url, String.class);
                    if (entity != null && entity.getStatusCodeValue() == 200) {
                    //if (entity != null){
                        String response = entity.getBody();
                        System.out.println("The response we received on hitting the URL is" +  response);
                        return response;
                    }
                    else{
                        System.out.println("Failed to receive the response status 200, the received API response status is :" + entity.getStatusCodeValue());
                        System.out.println("The actual response received is " + entity.getBody());
                    }
                }catch(Exception e1){
                    e1.printStackTrace();
                    System.out.println("Response retrieved is not valid");
                    continue;
                }
            }
        } catch (Exception th) {
            th.printStackTrace();
            System.out.println("Failed in get response for the URL" + url);
        }
        return null;
    }

    private RestTemplate geRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        SimpleClientHttpRequestFactory simpleClientHttpRequestFactory=new SimpleClientHttpRequestFactory();
        simpleClientHttpRequestFactory.setConnectTimeout(20000);
        simpleClientHttpRequestFactory.setReadTimeout(25000);
        restTemplate.setRequestFactory(simpleClientHttpRequestFactory);
        return restTemplate;
    }
}
