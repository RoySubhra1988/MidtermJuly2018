package datastructure;

import databases.ConnectToSqlDB;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) throws IOException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = "/Users/subhra/MIdterm/MidtermJuly2018/src/data/self-driving-car";
		File file = new File(textFile);
		BufferedReader br = null;
		String line = "";
		String store = "";


		try {

			FileReader fr = new FileReader(textFile);
			br = new BufferedReader(fr);



			while ((line = br.readLine()) != null) {
				store+=line;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		Stack<String> wrdMap = new Stack<String>();
		LinkedList<String> linkedList = new LinkedList<>();
		String[] splitWords = textFile.split(" ");

		for (String word : splitWords) {
			Integer count = wrdMap.indexOf(splitWords);
			if (count == null) {
				count = 0;
			}
			wrdMap.add(word);
		}
		wrdMap.push(textFile);
		System.out.println(wrdMap);

		String[] storeArray = store.split(" ");
		List<String> storeList = new LinkedList<String>();
		Stack<String> storeStack = new Stack<String>();

		for (String element: storeArray) {
			storeList.add(element);
			storeStack.push(element);
		}
		System.out.println("\n\nLinkedlist LIFO:");
		Iterator<String> itr = storeList.iterator();
		while (itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		System.out.println("\n\nStack LIFO:");

		while (!storeStack.isEmpty())
		{
			System.out.print(storeStack.pop() + " ");
		}



	}

}
