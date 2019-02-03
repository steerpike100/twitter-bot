package tech.verenti.test;

import io.restassured.RestAssured;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import tech.verenti.support.PayLoad;

import static io.restassured.RestAssured.given;

public class TwitterBotTest extends PayLoad  {

    String consumerKey = "eJyvWBJT5X4P80zPFdqRPXoHk";
    String consumerSecret = "wpCg5J1WNydXcgMf6aJeSs3VRTEeLPC4Pow7Fg3tOqoFO42jjv";
    String accessToken = "3093516472-FYONSDwBAOFiZsOKs4CYKDyHmFsCSgSHXdj5AA7";
    String tokenSecret = "7wK9fNy4vqJH9BesMrop3RH2b7j5s8iM3yEe6fESMfxNk";

    String id;

    RestAssuredConfig timeout = RestAssuredConfig.config()
            .httpClient(HttpClientConfig.
                    httpClientConfig().setParam("CONNECTION_MANAGER_TIMEOUT", 12000));


    @Test
    public void createTweet(){

        RestAssured.baseURI="https://api.twitter.com/1.1/statuses";

        Response res = given().config(timeout).
                auth().oauth(consumerKey,consumerSecret,accessToken,tokenSecret).
                queryParam("status", generatePossessive() + " " + generateMainClause() + " " + generateAdverbialClause()).
                when().post("/update.json").
                then().extract().response();

        String response = res.asString();
        System.out.println(response);
        JsonPath js = new JsonPath(response);
        System.out.println(js.get("id").toString());
        id = js.get("id").toString();

    }
}
