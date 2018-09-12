package design;

import databases.ConnectToSqlDB;

import java.util.List;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) throws Exception{


		EmployeeInfo emp1 = new EmployeeInfo(101);
		EmployeeInfo emp2 = new EmployeeInfo("Subhra",102);
		EmployeeInfo emp3 = new EmployeeInfo("Ratan",103, 31);


EmployeeInfo.calculateEmployeeBonus(20000);
EmployeeInfo.calculateEmployeePension(40000);


		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		connectToSqlDB.createTableFromStringToMySql("employeeRecord","employeeName","employeeSalary");
		connectToSqlDB.insertDataToProfileToMySQL("employeeRecord","employeeName","employeeSalary");
		List<String> name = connectToSqlDB.directDatabaseQueryExecute("Select * From employeeRecord5","employeeName");
		for (String  st : name) {
			System.out.println(st);
		}
	}

}
