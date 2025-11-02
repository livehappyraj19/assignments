package language.basics;

import java.util.logging.Logger;

public class PrintStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello Println -- Prints and goto New Line ");
System.out.print("Prints in same line and stays in same line");
System.out.println();
System.out.print("Again22 this Prints in same line and stays in same line");
System.out.println();
System.out.printf("%s has completed BE and His Employee_ID = %d , And Visa Status is %b", "Kiran", 1234, true);

// Error Message in Red print
System.out.println();
System.err.println("THere is a error in this line");
	

	Logger logger = Logger.getLogger("Hello World");
			logger.info("There is a info inline No 18  And program is going well");
			
			System.out.println("");
			logger.info("THere is a warning , THere is something wrong in this");
			
	}
}
