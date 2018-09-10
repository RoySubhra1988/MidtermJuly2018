package datastructure;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import databases.ConnectToMongoDB;
import databases.ConnectToSqlDB;
import parser.Student;


import java.util.*;

public class UseMap {


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

        List<String> middleName = new ArrayList<>();
        middleName.add("Tanu");
        middleName.add("Kumar");
        middleName.add("Ahmed");


        List<String> lastName = new ArrayList<>();
        lastName.add("Roy");
        lastName.add("Mazumder");
        lastName.add("Howlader");


        Map<String, List<String>> list = new HashMap<String, List<String>>();
        list.put("FirstName", firstName);
        list.put("MiddleName", middleName);
        list.put("LastName", lastName);

        //For Each loop to retrieve data
        for (Map.Entry key : list.entrySet()) {
            System.out.println(key.getKey() + " " + key.getValue());
        }


        // Using while loop with Iterator to retrieve data
        Iterator it = list.entrySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
        // Connection to the Database

        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertDataFromMapToMySql((Map<String, List<String>>) firstName, "Table1", "FirstName");
        connectToSqlDB.insertDataFromMapToMySql((Map<String, List<String>>) middleName,"Table2", "MiddleName");
        connectToSqlDB.insertDataFromMapToMySql((Map<String, List<String>>) lastName,"Table3", "LastName");


	}



}






