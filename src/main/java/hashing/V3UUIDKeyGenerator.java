package hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class V3UUIDKeyGenerator {

  public static UUID generateHash(UUID userID, UUID companyID) {
    String combinedID = userID.toString() + companyID.toString();
    return UUID.nameUUIDFromBytes(combinedID.getBytes());
  }

  public static void main(String[] args) {

    UUID userId = UUID.fromString("e052bf96-76f6-4247-a4f1-c44e6e8930e4");
    UUID companyId = UUID.fromString("da2657ad-ad33-4864-b3d8-b82a6ece3062");

    List<UUID> uniqueUuids = new ArrayList<>();
    Set<UUID> set = new HashSet<>();
    long start = System.currentTimeMillis();
    for (int i = 0; i < 10000000; i++) {
      UUID hashValue = generateHash(userId, companyId);
      if (set.add(hashValue)) {
        uniqueUuids.add(hashValue);
      }
    }
    long stop = System.currentTimeMillis();
    long time = stop - start;
    System.out.println(uniqueUuids.size() + "  in " + time + " seconds");
    System.out.println(uniqueUuids);
  }
}