package hashing;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//import java.util.UUID;

public class HashKeyGenerator {
  private final MessageDigest messageDigest;

  public HashKeyGenerator() throws NoSuchAlgorithmException {
    this.messageDigest = MessageDigest.getInstance("SHA-1");
  }

  public static void main(String[] args) throws NoSuchAlgorithmException {
    HashKeyGenerator generator = new HashKeyGenerator();
    Set<String> set = new HashSet<>();
    List<String> uniqueIds = new ArrayList<>();
    //UUID userId = UUID.fromString("e052bf96-76f6-4247-a4f1-c44e6e8930e4");
    //UUID companyId = UUID.fromString("da2657ad-ad33-4864-b3d8-b82a6ece3062");
    String vehicle = "{\n" +
        "      \"marketPlaceVehicleId \": \"cd94418c-ed12-472d-86b4-74e16696fee1\",\n" +
        "      \"accountId\": \"\",\n" +
        "      \"customerAssetId\": \"f4f4f298-701c-ec11-b6e6-00224828c6b6\",\n" +
        "      \"createdOn\": \"2023-04-24T22:40:16.575623Z\",\n" +
        "      \"modifiedOn\": \"2023-05-18T07:21:33.592241Z\",\n" +
        "      \"vinNumber\": \"1GNSKHKCXKR330453\",\n" +
        "      \"make\": \"46\",\n" +
        "      \"acesVehicleId\": \"253422\",\n" +
        "      \"trimPackage\": \"430\",\n" +
        "      \"modelName\": \"Suburban\",\n" +
        "      \"model\": \"21472\",\n" +
        "      \"licensePlateNumber\": \"QZQ380\",\n" +
        "      \"makeName\": \"Chevrolet\",\n" +
        "      \"year\": \"2019\",\n" +
        "      \"engineBaseId\": \"2059\",\n" +
        "      \"fleetId\": \"1076561\",\n" +
        "      \"vehicleId\": \"146476\",\n" +
        "      \"vehicleDisplayName\": \"1076561\",\n" +
        "      \"engineBaseName\": \"5.3L V8 5328 OHV\",\n" +
        "      \"plateState\": \"FL\",\n" +
        "      \"mileage\": 30000\n" +
        "    }";

    //String vehicle = "sdlkfkjd";
    String tenantId = "68994";
    long sum = 0;
    int iterations = 10;
    long start = System.currentTimeMillis();
    long time = 0;
    for (int i = 0; i < 10000000; i++) {
      // for (int j = 0; j < iterations; j++) {
      String id = generator.generateUniqueKey(vehicle, tenantId);
      System.out.println(id);
      long stop = System.currentTimeMillis();
      time = stop - start;
      System.out.println("time  in " + time + " milli seconds");
      sum = sum + time;
      // }
      if (set.add(id)) {
        uniqueIds.add(id);
      }
    }
    //long stop = System.currentTimeMillis();
    //long time = stop - start;
    System.out.println(uniqueIds.size() + "  in " + time + " milli seconds");
    //System.out.println("time  in " + time + " milli seconds");
    System.out.println("Average time in ms : " + sum / iterations);
    //System.out.println(uniqueIds);

  }


  public String generateUniqueKey(String val1, String val2) {
    //String userIdStr = userId.toString();
    //String companyIdStr = companyId.toString();
    String concatString = val1 + val2;
    String hash = hash(concatString);
    return hash;
  }

  private String hash(String input) {
    byte[] inputBytes = input.getBytes();
    byte[] hashBytes = messageDigest.digest(inputBytes);
    StringBuilder sb = new StringBuilder();
    for (byte b : hashBytes) {
      sb.append(String.format("%02x", b));
    }
    return sb.toString();
  }
}

