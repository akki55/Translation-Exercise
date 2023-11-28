package org.example;

import lombok.Getter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class TranslateService {

    private String apiUrl;
    private String apiKey;
    @Getter
    private static URL endpoint;

    public TranslateService(String apiUrl, String apiKey) throws MalformedURLException {
        this.apiUrl = apiUrl;
        this.apiKey = apiKey;
        // the endpoint of Google is a combination of the apiUrl and the key passed as a path parameter
        this.endpoint = new URL(apiUrl + "?key=" + apiKey);
    }

    /** This  function takes the translateInput and modify it to make it compatible with Google Translate API
     * Please Check this https://cloud.google.com/translate/docs/basic/translating-text.
     * This function returns a list of stings such that each string is formated as the following:
     * "(detectedSourceLanguage) Line -> (destLanguage) Translated Line"
     */
    public static List<String> translate(TranslateInput translateInput) {
        List<String> reply = new ArrayList<>();
        //add code here!
        //remove this line once the code is implemented!
        reply.add("it works, time to implement some code");
        return reply;
    }

    /** This function takes the Google Translate request body, establish a connection and gets the response as a JSONobject
     * This response is returned and processed in the translate function.
     */
    public static JSONObject sendGoogleTranslateRequest(String requestBody) {
        try {
            HttpURLConnection connection = (HttpURLConnection) endpoint.openConnection();
            // Add code here!
            // Set the necessary headers
            // Write the request body to the connection
            // Get the response from the server
        }  catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        // Change this line once the code is implemented!
        return new JSONObject();
    }
}
