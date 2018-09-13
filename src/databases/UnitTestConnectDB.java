package databases;

import org.testng.Assert;

public class UnitTestConnectDB {
    public static void main(String[] args) throws Exception {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
try {
    Assert.assertEquals(connectToSqlDB.readDataBase("Bubble_sort", "SortingNumbers"), connectToSqlDB.readDataBase("Bubble_sort", "SortingNumbers"));
    System.out.println("Passed you are connected to the Database");
}catch (Exception e){
    e.printStackTrace();
}

    }
}
