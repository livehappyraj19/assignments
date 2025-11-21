package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment5_Collection_Map {

	public static void main(String[] args) {
		System.out.println("---Assessment 5-- Maps in Collections-----");
		System.out.println("Inside this Excel There are 3 TestCases with each Testcase having 3 rows of data. Now, CreateMap<String, List<Map<String, String>>> to store all the data and Print the data from Product details > Supplier Name > Office Depot  from the  Map<String, List<Map<String, String>>>");
		
		
		Map<String,String> student1 = new HashMap<String,String>();
		
		student1.put("Name", "John");
		student1.put("Age", "20");
		student1.put("Gender", "Male");
		student1.put("Roll Number", "SBA12345");
		student1.put("Grade", "A++");
		student1.put("Major", "Computer");
		student1.put("GPA", "A3.8");
		student1.put("Email", "john@example.com");
		student1.put("PAN Number", "SDF6543210");
		student1.put("Address", "123 Elm St");	
		
		Map<String,String> student2 = new HashMap<String,String>();
		
		student2.put("Name", "Jane Smith");
		student2.put("Age", "21");
		student2.put("Gender", "FeMale");
		student2.put("Roll Number", "SBA12346");
		student2.put("Grade", "B+");
		student2.put("Major", "Mathematics");
		student2.put("GPA", "A3.6");
		student2.put("Email", "Jane@example.com");
		student2.put("PAN Number", "REW6543211");
		student2.put("Address", "456 Oak St");	
		
		Map<String,String> student3 = new HashMap<String,String>();
		
		student3.put("Name", "Mike Brown");
		student3.put("Age", "22");
		student3.put("Gender", "Male");
		student3.put("Roll Number", "SBA12347");
		student3.put("Grade", "A+");
		student3.put("Major", "Physics");
		student3.put("GPA", "A3.9");
		student3.put("Email", "mike@example.com");
		student3.put("PAN Number", "TYR6543212");
		student3.put("Address", "789 Pine St");	
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
//		 Adding all 3 student into one List
		System.out.println("=======Adding all 3 student into one List=======");
		
		List<Map<String,String>> studentList = new ArrayList<Map<String,String>>();
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		
		System.out.println(studentList);

//		---  2nd table
		
		Map <String, String> emp1Map = new HashMap<String, String> ();
		emp1Map.put("EmpID", "E001");
		emp1Map.put("Name", "Alice Green");
		emp1Map.put("Age", "30");
		emp1Map.put("Gender", "FeMale");
		emp1Map.put("Department", "Engineering");
		emp1Map.put("Position", "Software Engineer");
		emp1Map.put("Salary", "75K Pounds");
		emp1Map.put("Email", "alice@example.com");
		emp1Map.put("PAN Number", "SDF6543210");

		System.out.println(emp1Map);
		
		Map <String, String>  emp2Map = new HashMap<String, String> ();
		emp2Map.put("EmpID", "E002");
		emp2Map.put("Name", "Bob Johnson");
		emp2Map.put("Age", "35");
		emp2Map.put("Gender", "Male");
		emp2Map.put("Department", "Marketing");
		emp2Map.put("Position", "Marketing Manager");
		emp2Map.put("Salary", "85K Pounds");
		emp2Map.put("Email", "bob@example.com");
		emp2Map.put("PAN Number", "REW6543211");
		
		System.out.println(emp2Map);
		
		Map <String, String> emp3Map = new HashMap <String,String> ();
		emp3Map.put("EmpID", "E003");
		emp3Map.put("Name", "Carol White");
		emp3Map.put("Age", "28");
		emp3Map.put("Gender", "Male");
		emp3Map.put("Department", "Sales");
		emp3Map.put("Position", "Sales Executive");
		emp3Map.put("Salary", "65K Pounds");
		emp3Map.put("Email", "carol@example.com");
		emp3Map.put("PAN Number", "TYR6543212");
		
		System.out.println(emp3Map);
		
//		 Adding all 3 student into one List
		System.out.println("=======Adding all 3 Emp into one List=======");
		
		List<Map<String,String>> empList = new ArrayList<Map<String,String>>();
		
		empList.add(emp1Map);
		empList.add(emp2Map);
		empList.add(emp3Map);
		
		System.out.println(empList);
		

		Map<String, String> product1 = new HashMap <String,String>();
		product1.put("Name", "Laptop");
		product1.put("Category", "Electronics");
		product1.put("Price", "12K Pounds");
		product1.put("Stock_Quantity", "Not Available");
		product1.put("Supplier", "Tech Supplies");
		product1.put("Warranty", "2 Years");
		product1.put("Rating", 	"4.5 Stars");
		product1.put("ManufactureDate", "Aug 2023"	);
		product1.put("Expiry Date", "Aug 2028");
		
		System.out.println(product1);  
		
		Map<String, String> product2 = new HashMap <String,String>();
		product2.put("Name", "Desk Chair");
		product2.put("Category", "Furniture");
		product2.put("Price", "150K Pounds");
		product2.put("Stock_Quantity", "2");
		product2.put("Supplier", "Office Depot");
		product2.put("Warranty", "1 Years");
		product2.put("Rating", 	"4 Stars");
		product2.put("ManufactureDate", "Sep 2024"	);
		product2.put("Expiry Date", "NA");
		
		System.out.println(product2);  
		
		Map <String,String> product3 = new HashMap<String,String>();
		product3.put("Name", "Coffee Maker");
		product3.put("Category", "Kitchen");
		product3.put("Price", "75K Pounds");
		product3.put("Stock_Quantity", "200");
		product3.put("Supplier", "Kitchen World");
		product3.put("Warranty", "6 Months");
		product3.put("Rating", 	"4.2 Stars");
		product3.put("ManufactureDate", "Jan 2025"	);
		product3.put("Expiry Date", "Jan 2027");
		
		System.out.println(product3);
		
//		 Adding all 3 Products into one List
		System.out.println("=======Adding all 3 Products into one List=======");
	
		List<Map<String,String>> productList = new ArrayList<Map<String, String>> ();
		empList.add(emp1Map);
		
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		
		Map <String, List<Map<String,String>>> allTables =new HashMap<String,List<Map<String,String>>> ();
		allTables.put("Products", productList);
		allTables.put("Employees", empList);
		allTables.put("Students", studentList);
		
		System.out.println("--=====ALL Tables======");
		System.out.println(allTables);
		
		System.out.println( allTables.get("Products").get(1).get("Supplier"));
		
		
	}
	
	

}
