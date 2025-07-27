package com.automation.api.tests;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class CoinGeckoAPITest {

    @Test
    public void testCoinGeckoBitcoinEndpoint() {
        Response response = given()
            .when()
            .get("https://api.coingecko.com/api/v3/coins/bitcoin")
            .then()
            .statusCode(200)
            .extract().response();

        JsonPath json = response.jsonPath();

        String homepage = json.getString("links.homepage[0]");
        Assert.assertNotNull(homepage);
        Assert.assertFalse(homepage.isEmpty(), "Homepage URL should not be empty");

        Float priceChange = json.getFloat("market_data.price_change_percentage_24h");
        Assert.assertNotNull(priceChange);

        String[] currencies = {"usd", "eur", "gbp"};
        for (String currency : currencies) {
            Assert.assertNotNull(json.get("market_data.market_cap." + currency), "Missing market cap for " + currency);
            Assert.assertNotNull(json.get("market_data.total_volume." + currency), "Missing volume for " + currency);
        }
    }
}
