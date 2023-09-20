package dataweavetojava;


import java.util.*;
import java.util.stream.*;

public class DW1 {
  public static void main(String[] args) {
    List<Map<String, Object>> requestBody = Arrays.asList(
        new HashMap<String, Object>() {{
          put("firstName", "A");
          put("lastName", "B");
          put("age", 30);
          put("salary", 30000);
        }},
        new HashMap<String, Object>() {{
          put("firstName", "C");
          put("lastName", "D");
          put("age", 29);
          put("salary", 50000);
        }},
        new HashMap<String, Object>() {{
          put("firstName", "E");
          put("lastName", "F");
          put("age", 31);
          put("salary", 41000);
        }},
        new HashMap<String, Object>() {{
          put("firstName", "G");
          put("lastName", "H");
          put("age", 33);
          put("salary", 29000);
        }}
    );

    List<Map<String, Object>> result = requestBody.stream()
        .filter(item -> (int) item.get("salary") > 30000)
        .map(item -> new HashMap<String, Object>() {{
          put("age", item.get("age"));
          put("salary", item.get("salary"));
        }})
        .collect(Collectors.toList());

    System.out.println(result);
  }
}
