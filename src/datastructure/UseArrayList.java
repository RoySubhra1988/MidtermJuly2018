package datastructure;

import databases.ConnectToMongoDB;
import databases.ConnectToSqlDB;

import java.util.*;

public class UseArrayList {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<Integer> MyNumber = new ArrayList<>();
		//add element to Arraylist
		MyNumber.add(100);
		MyNumber.add(200);
		MyNumber.add(300);
		MyNumber.add(400);
		MyNumber.add(500);

		//Print Array List
		System.out.println("Retrieving elements from ArrayList: " + MyNumber);

		//Using get method to peek the first element
		System.out.println("Peek first element: " + MyNumber.get(0));

		//remove element from ArrayList
		System.out.println("Remove element at index 1: " + MyNumber.remove(4));

		//Retrieving elements from ArrayList
		System.out.println("Re-retrieving elements from ArrayList: " + MyNumber);

		//Using 'forEach' loop
		System.out.println("Use of for-each loop: ");
		for (Integer integer : MyNumber) {
			System.out.println(integer);
		}

		//using iterator
		System.out.println("Use of iterator using while loop: ");
		Iterator it = MyNumber.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());
		}

		//Sorting ArrayList
		Collections.sort(MyNumber);
		System.out.println(MyNumber);
		List list = new ArrayList();
		list = MyNumber;

		//Connect to MySql Database
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		 //create a table in to Mysql
		try {
			connectToSqlDB.createTableFromStringToMySql2("Students","Number");


		//Insert data in the database
		connectToSqlDB.insertDataFromArrayListToSqlTable(list,"Students","Number");

		//Read data from database

List<String> Number = connectToSqlDB.readDataBase("Students","Number");

		for (String st : Number) {
			System.out.println(st);
		}
	}catch (Exception e){
			e.printStackTrace();
		}

	}

}
