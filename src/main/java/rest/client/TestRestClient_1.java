package rest.client;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TestRestClient_1 {


  public static void main(String[] args) {

    String baseUrl = "https://jsonplaceholder.typicode.co";
    String relativeUrl = "/users/1";
    // Define the endpoint URL
    String apiUrl = baseUrl + relativeUrl;

    // Create a URL object from the endpoint URL
    URL url = null;
    try {
      url = new URL(apiUrl);


      // Open a connection to the URL
      HttpURLConnection con = (HttpURLConnection) url.openConnection();

      // Set the request method to GET
      con.setRequestMethod("GET");

      // Set the request headers (if required)
      con.setRequestProperty("Content-type", "application/json");
      //con.setRequestProperty("Authorization", "Bearer myAccessToken");

      // Get the response code //actual API call
      int responseCode = con.getResponseCode();

      // If the response code is successful, read the response body
      if (responseCode == HttpURLConnection.HTTP_OK) {
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
          response.append(inputLine);
        }
        in.close();

        // Print the response body
        System.out.println(response);

        // Create an ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        // Parse the JSON response into a JsonNode object
        JsonNode jsonNode = objectMapper.readTree(response.toString());

        // Extract the city value from the JsonNode object
        String city = jsonNode.get("address").get("city").asText();

        String email = jsonNode.get("email").asText();


        // Print the city value
        System.out.println("City ==" + city);
        System.out.println("Email ==" + email);


      } else {
        System.out.println("Error response code: " + responseCode);
      }

    }catch (Exception e){
      System.out.println("Some error occurred, pls try again");
    }
  }
}



