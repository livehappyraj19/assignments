package assignments;

public class Assignment8_Cond_StmtLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bank Transactions 
//		Positive value refers Credit and Negative refers Debit Transaction 
//		Transactions Amount 
//		1 50000 
//		2 -2000 
//		3 3000 
//		4 -15000 
//		5 -200 
//		6 -300 
//		7 4000 
//		8 -3000 
//		  
//		First Store all the transactions in any data structure of Your Choice from collections, and by using 
//		Loops and conditional statements 

		int[] transaction = {5000,-2000, 3000 ,-15000 ,-200 , -300, 4000,-3000  };
		
		System.out.println("Bank Transaction " +transaction[1]);
		
//		1. Print total number of credit and debit transactions completed 
//		2. Print the total amount credited and debited in account  
//		3. Print total amount remaining at the end in Bank Account 
//		4. If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit 
//		Transaction with Amount” and also print total number of suspicious transactions
		
		int creditcount =0;
		int debitcount =0;
		int creditAmountTotal =0;
		int debitAmountTotal =0;
		int balanceAmount =0;
		int suspiousAmount =0;
		
		for (int amount:transaction) {
			if (amount >0 )
			{ 
				creditcount ++;
				creditAmountTotal += amount ;
				
				
			}
		}
	}

}
