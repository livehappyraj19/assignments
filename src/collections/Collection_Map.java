package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection_Map {

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

		
	}

}
