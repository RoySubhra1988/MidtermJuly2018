package datastructure;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import databases.ConnectToMongoDB;


import java.util.*;

public class UseMap {
    public static MongoDatabase mongoDatabase = null;

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */



        // Add List<String> into a Map


        List<String> firstName = new ArrayList<>();
        firstName.add("Subhra");
        firstName.add("Ratan");
        firstName.add("Mizan");



        List<String> lastName = new ArrayList<>();
        lastName.add("Roy");
        lastName.add("Mazumder");
        lastName.add("Howlader");


        Map<String, List<String>> list = new HashMap<String, List<String>>();
        list.put("FirstName",firstName);
        list.put("LastName", lastName);

        //For Each loop to retrieve data
        for (Map.Entry<String, List<String>> Print: list.entrySet()) {
            System.out.println(Print.getKey()+ "  "+ Print.getValue());
        }


        // Using while loop with Iterator to retrieve data
            Iterator<Map.Entry<String, List<String>>> it = list.entrySet().iterator();

            while(it.hasNext()){
               Map.Entry<String,List<String>> Both = it.next();
                System.out.println(Both.getKey() + " " + Both.getValue());
                }



        // Connection to the Database

        ConnectToMongoDB connectToMongoDB = new ConnectToMongoDB();

        MongoClient mongoClient = new MongoClient();
        mongoDatabase = mongoClient.getDatabase("Family");
        System.out.println("DataBAse Connected");





    }


}






