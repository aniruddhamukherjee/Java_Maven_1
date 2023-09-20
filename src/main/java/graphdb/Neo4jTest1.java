package graphdb;

// Add your the driver dependency to your pom.xml build.gradle etc.
// Java Driver Dependency: http://search.maven.org/#artifactdetails|org.neo4j.driver|neo4j-java-driver|4.0.1|jar
// Reactive Streams http://search.maven.org/#artifactdetails|org.reactivestreams|reactive-streams|1.0.3|jar
// download jars into current directory
// java -cp "*" Example.java

import org.neo4j.driver.*;
import org.neo4j.driver.Record;

import static org.neo4j.driver.Values.parameters;

public class Neo4jTest1 {

  public static void main(String...args) {

    Driver driver = GraphDatabase.driver("bolt+s://c40a8df7.databases.neo4j.io",
        AuthTokens.basic("neo4j","vmuLlrrkVbP1GBNxioaFw9G8XalOdNiZooxGpqNoeVM"));

    try (Session session = driver.session(SessionConfig.forDatabase("neo4j"))) {

      //String cypherQuery =
         // "MATCH (a:Airport{iata:$iata})-[r:HAS_ROUTE]->(other)\n" +
          //    "  RETURN other.iata AS destination";
      String cypherQuery =
          "MATCH p=()-[:DIRECTED]->() RETURN p LIMIT 25" ;



      /*var result = session.readTransaction(
          tx -> tx.run(cypherQuery,
                  parameters("iata","DEN"))
              .list());
*/

      var result = session.readTransaction(
          tx -> tx.run(cypherQuery,
                  parameters())
              .list());
      for (Record record : result) {
        System.out.println(record.toString());
      }
    }
    driver.close();
  }
}