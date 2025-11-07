package assignments;

//Then, create another class called EmpGroups that contains 
//two arrays to store the employee names and IDs.
//Retrieve the data from the Employees class, store it in these arrays, 
//and finally print each employee's name along with their corresponding ID.
//Example:
//• Employee Name: Bharath, Employee ID: 1234

public class Assignment3_EmpGroups {


	public static void main(String[] args) {
		
		Assignment3_EmpMainClass obj =new Assignment3_EmpMainClass(); //Create object
// Array to Store the Emp Names in this class from other class ---------		
		String [] Emp_Name = new String[3];

		Emp_Name[0] = obj.Emp_Name1;
		Emp_Name[1] = obj.Emp_Name2;
		Emp_Name[2] = obj.Emp_Name3;

//Array to store the EmpID form the other class to this  variable		
		int[] EmpID = new int[3];
		
		EmpID[0] = obj.Emp_Id1;
		EmpID[1] = obj.Emp_Id2;
		EmpID[2] = obj.Emp_Id3;
		
		// Calling from above stored variable
		System.out.print("Employee Name: " + Emp_Name[0]);
		System.out.println(" Emp_ID : " + EmpID[0]);
		
		System.out.println("Employee Name: "+ Emp_Name[1] +", "+ "Employee_ID :" + EmpID[1] );
		System.out.println("Employee Name: "+ Emp_Name[2] +", "+ "Employee_ID :" + EmpID[2]);

		// Calling from Previous class defined values using obj
		System.out.println("Employees Names using obj:-- " + obj.Emp_Name1 );
		System.out.println("Emp_ID --USING OBJ  : "+ obj.Emp_Id1);
		
	}
}
