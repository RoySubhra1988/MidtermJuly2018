package design;

import java.util.Scanner;

public class EmployeeInfo extends AbstractEmployee  {
	public static Object nameClass;

	/*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
	 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
	 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
	 * go to FortuneEmployee class to apply all the fields and attributes.
	 *
	 * Important: YOU MUST USE the
	 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
	 * Use all kind of keywords(super,this,static,final........)
	 * Implement Nested class.
	 * Use Exception Handling.
	 *
	 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;
	private String name;
	private int employeeID;
	private int salary;
	private int performance;
	public static int years;
	public  double Salary;
	private String dept;

	public static String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		EmployeeInfo.companyName = companyName;
	}

	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(){}

	public EmployeeInfo(int employeeId) {
		this.employeeID = employeeId;
	}

	public EmployeeInfo(String name, int employeeId) {
		this.name = name;
		this.employeeID = employeeId;

	}

	public EmployeeInfo(String name, int employeeId, double Salary) {
		this.name = name;
		this.employeeID = employeeId;
		this.Salary = Salary;

	}


	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public static double calculateEmployeeBonus(double Salary, double performence) {

		performence = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter How Many years worked");
		years = sc.nextInt();

		if (years >= 5){
			performence = .20;
			System.out.println("Wow ! Excelent Performence and keep up the good work" );
		}else if (years <= 4 && years >= 3){
			performence = .10;
			System.out.println("Good! Try more to keep up the good work" );
		}else if (years <= 2 && years >= 1 ){
			performence = .05;
			System.out.println("You are almost there !!" );
		}else {
			System.out.println("Sorry Bonuses are only for employees that have worked more than a year");
		}
		double total = (Salary * performence);

		System.out.println("Epmloyees bonus is " + total + " $");
		return total;
	}

	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 *
	 */
	public static double calculateEmployeePension(int salary) {
		double total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
		String convertedJoiningDate = DateConversion.convertDate(joiningDate);
		String convertedTodaysDate = DateConversion.convertDate(todaysDate);

		//implement numbers of year from above two dates
		//Calculate pension

			String startYear = convertedJoiningDate.substring(convertedJoiningDate.length() - 4);
			String currentYear = convertedTodaysDate.substring(convertedTodaysDate.length() - 4);
		int start = Integer.parseInt(startYear);
		int current = Integer.parseInt(currentYear);

		if ((current - start) >= 10 ) {
			total = salary * .5;
		}  else if ((current - start) == 9 )  {
			    	total = salary * .4;
		}
		else if ((current - start) == 8 )  {
			total = salary * .3;}

		 else if ((current - start) == 7 ) {
			total = salary * .25;
		}
		 else if ((current - start) == 6) {
		 	total = salary * .2; }

			else if ((current - start) == 5) {
			total = salary * .1;


		} else if ((current - start) <= 4) {
			total = 0;
			System.out.println("Sorry you have to work more than 5 years to be eligible for pension ! ");
		}  else {
			System.out.println("you have a problem");
		}

		System.out.println("Employee Pension is " + total + " $");
		return total;
	}


	public String getName() {
		return name;
	}

	public String setName(String name) {
		this.name = name;
		return name;
	}

	public int employeeId() {

		return 0;
	}


	public String employeeName() {
		return null;
	}

	@Override
	public void assignDepartment() {
		System.out.println("The Employee will be Assign to a department when they joined ");

	}

	@Override
	public void calculateSalary() {

	}

	public String assignDepartment(String dept) {
		this.dept = dept;


	return dept;
	}


	public void calculateSalary(double Salary) {

	}


	public void benefitLayout() {
		System.out.println("Employee will get all the benefits");

	}

	public String getDept() {

		return null;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getEthnicity() {
		return null;
	}

	public String getHeight() {
		return null;
	}

	public void groceryBudget() {
		System.out.println("My yearly Grocery Bill is "+(double)(this.Salary*.05)+" Dollars");

	}
	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getPerformance() {
		return performance;
	}

	public void setPerformance(int performance) {
		this.performance = performance;
	}



	private static class DateConversion {

		public DateConversion(Months months) {
		}

		public static String convertDate(String date) {
			String[] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}

	public class NameClass {
		public void NameMethod() {
			System.out.println(companyName);
		}
	}
}


