package assignments;

public class Assignment3_EmpMainClass {

	 String Emp_Name1 = "Bharath";
	 String Emp_Name2 = "John";
	 String Emp_Name3 = "Aarav";
	
	 int Emp_Id1 = 1234;
	 int Emp_Id2 = 1235;
	 int Emp_Id3 = 1236;
	
	
	public static void main(String[] args) {
		Assignment3_EmpMainClass obj =new Assignment3_EmpMainClass(); //Create object

//		Create an Employees class that stores the following 
//		employee names and IDs in separate variables:
//		• Employee Names: "Bharath", "John", "Aarav"
//		• Employee IDs: 1234, 1235, 1236
		
		System.out.println("Employees Names are " + obj.Emp_Name1);
		System.out.println("Emp_ID are : "+ obj.Emp_Id1);

		
		System.out.println("Employees Names are : " + obj.Emp_Name1 + ',' + obj.Emp_Name2 + ',' + obj.Emp_Name3 );
		System.out.println("Emp_ID s are : "+ obj.Emp_Id1 +',' + obj.Emp_Id2 + ',' + obj.Emp_Id3 );
		

	}

}
