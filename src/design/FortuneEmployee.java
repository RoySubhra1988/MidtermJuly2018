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
		EmployeeInfo emp3 = new EmployeeInfo("Ratan",103, 30000);
		EmployeeInfo emp4 = new EmployeeInfo("Yakub",104, 45000);


		emp1.assignDepartment("Developer");
		emp2.assignDepartment("Tester");
		emp3.assignDepartment("Business Analyst");
		emp4.assignDepartment("Preject Manager");




EmployeeInfo.calculateEmployeeBonus(20000,6);
EmployeeInfo.calculateEmployeePension(40000);

		emp1.setSalary(10000);
		emp1.calculateSalary(emp1.getSalary());
		emp2.setSalary(20000);
		emp2.calculateSalary(emp2.getSalary());
		emp2.setSalary(30000);
		emp3.calculateSalary(emp3.getSalary());
		emp4.setSalary(40000);
		emp4.calculateSalary(emp4.getSalary());

		emp1.setPerformance(5);
		double bonus101 = emp1.calculateEmployeeBonus(emp1.getSalary(), emp1.getPerformance());
		emp2.setPerformance(4);
		double bonus102 = emp2.calculateEmployeeBonus(emp2.getSalary(), emp2.getPerformance());
		emp3.setPerformance(3);
		double bonus103 = emp3.calculateEmployeeBonus(emp3.getSalary(), emp3.getPerformance());
		emp4.setPerformance(2);
		double bonus104 = emp4.calculateEmployeeBonus(emp4.getSalary(), emp4.getPerformance());


		/*ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		connectToSqlDB.createTableFromStringToMySql("employeeRecord","employeeName","employeeSalary");
		connectToSqlDB.insertDataToProfileToMySQL("employeeRecord","employeeName","employeeSalary");
		List<String> name = connectToSqlDB.directDatabaseQueryExecute("Select * From employeeRecord5","employeeName");
		for (String  st : name) {
			System.out.println(st);
		}*/
	}

}
