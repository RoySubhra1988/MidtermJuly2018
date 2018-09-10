package datastructure;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CollectionView {

public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");
        //For Each loop to retrieve data
        for (Map.Entry key : map.entrySet()) {
                System.out.println(key.getKey() + " " + key.getValue());
        }


        // Using while loop with Iterator to retrieve data
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
                System.out.println(it.next());

        }


    }

}
