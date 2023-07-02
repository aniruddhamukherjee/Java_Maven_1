package rest.client;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestRestClient {


  public static void main(String[] args) throws IOException {

    // Define the endpoint URL
    String apiUrl = "https://jsonplaceholder.typicode.com/users/1";

    // Create a URL object from the endpoint URL
    URL url = new URL(apiUrl);

    // Open a connection to the URL
    HttpURLConnection con = (HttpURLConnection) url.openConnection();

    // Set the request method to GET
    con.setRequestMethod("GET");

    // Set the request headers (if required)
    con.setRequestProperty("Content-type", "application/json");
    //con.setRequestProperty("Authorization", "Bearer myAccessToken");

    // Get the response code
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
// JSON response string from the API
      String jsonResponse = "{\"name\":\"John Doe\",\"age\":30,\"city\":\"New York\"}";

      // Create an ObjectMapper instance
      ObjectMapper objectMapper = new ObjectMapper();

      // Parse the JSON response into a JsonNode object
      JsonNode jsonNode = objectMapper.readTree(jsonResponse);

      // Extract the city value from the JsonNode object
      String city = jsonNode.get("city").asText();

      // Print the city value
      System.out.println(city); // Output: New York

    } else {
      System.out.println("Error response code: " + responseCode);
    }
  }
}



