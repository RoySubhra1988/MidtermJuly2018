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
		ArrayList<String> Student = new ArrayList<>();
		//add element to Arraylist
		Student.add("Subhra");
		Student.add("Alif");
		Student.add("Fahmida");
		Student.add("Ahmed");
		Student.add("Nasir");

		//Print Array List
		System.out.println("Retrieving elements from ArrayList: " + Student);

		//Using get method to peek the first element
		System.out.println("Peek first element: " + Student.get(0));

		//remove element from ArrayList
		System.out.println("Remove element at index 1: " + Student.remove(4));

		//Retrieving elements from ArrayList
		System.out.println("Re-retrieving elements from ArrayList: " + Student);

		//Using 'forEach' loop
		System.out.println("Use of for-each loop: ");
		for (String st : Student) {
			System.out.println(st);
		}

		//using iterator
		System.out.println("Use of iterator using while loop: ");
		Iterator it = Student.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());
		}

		//Sorting ArrayList
		Collections.sort(Student);
		System.out.println(Student);
		List list = new ArrayList();
		list = Student;

		//Connect to MySql Database
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

		//Insert data in the database
		connectToSqlDB.insertDataFromArrayListToSqlTable(Student,"Students","Name");

		//Read data from database

List<String> name = connectToSqlDB.readDataBase("Students","Name");
		for (String st : name) {
			System.out.println(st);
		}
	}

}
