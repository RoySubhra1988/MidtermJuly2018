package databases;

import org.testng.Assert;

public class UnitTestConnectDB {
    public static void main(String[] args) throws Exception {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

        Assert.assertEquals(connectToSqlDB.readDataBase("table1","employee"),connectToSqlDB.readDataBase("table1","employee"));



    }
}
