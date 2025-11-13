package assignments;

import java.util.Arrays;

//Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and 
//marks [75, 80, 82]-- Add 10 marks to each students using assignment operators and 
//store it into another array, after adding 10 marks identify the average marks
//of all  students

public class Assignment6_Operator_Variables {

	public static void main(String[] args) {
		// Student name Array
		String[] studentName = { "Suresh", "Mahesh", "Naresh" };
		
		System.out.println("Student Names are : " + studentName[0] +" , " + studentName[1] +" , " + studentName[2]  );
		
		int[] marks = { 75, 82, 80 };
		
		System.out.println("Marks are : " );
		
		System.out.println (studentName[0] + " : " + marks[0] );
		System.out.println (studentName[1] + " : " + marks[1] );
		System.out.println (studentName[2] + " : " + marks[2] );
		
		 // Add 10 for each student-- Assignment Operator
		marks[0] += 10;
		marks[1] += 10;
		marks[2] += 10;
		
//		System.out.println("Updated +10 Marks are : " + marks[0] + ',' + marks[1] + ',' +marks[2]);
	
		int[] updatedMarks  = { marks[0], marks[1], marks[2] };
		System.out.println("Updated +10 Marks From New Array are : " );
		System.out.println (studentName[0] + " : " + updatedMarks[0] );
		System.out.println (studentName[1] + " : " + updatedMarks[1] );
		System.out.println (studentName[2] + " : " + updatedMarks[2] );
		
		double  averageMarks ;
		averageMarks =  (updatedMarks[0] + updatedMarks[1] + updatedMarks[2]) /3.0 ;
		System.out.println("The Average of the Upadted Marks is : " + averageMarks);
	}

}
