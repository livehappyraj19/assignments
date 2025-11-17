package assignments;

public class Assignment7_Conditional_Stmts {

//	A bank evaluates loan applicants based on the following criteria:
//		1. Credit Score:
//		o If the credit score is above 750, the loan is automatically approved.
//		o If the credit score is between 650 and 750, additional checks are performed.
//		o If the credit score is below 650, the loan is denied.
	
//	Income:
//		o For credit scores between 650 and 750, the customer’s income must be at least $50,000
//		for the loan to be considered.
	
//	Debt-to-Income Ratio:
//		o If the customer is employed, the system checks the debt-to-income (DTI) ratio.
//		o If the DTI ratio is less than 40%, the loan is approved.
//		o If the DTI ratio is 40% or greater, the loan is denied.
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double creditScore = 652;
		double customerIncome = 51000;
		boolean employmentStatus = true;
		double debt_to_Income_Ratio = 49.0 ;
		
		if (creditScore > 750 ) {
			System.out.println("The loan is automatically approved.");
		}
		else if (creditScore >650 && creditScore <750 ) {
			System.out.println("additional checks are performed.");
			if (employmentStatus  ) { // if we give true but the actual value i false still it not woking
				if (customerIncome >=50000) {
					System.out.println("Loan is considered ");
					if (debt_to_Income_Ratio <40) {
						System.out.println("DTI ratio is less than 40%, the loan is approved");
					}
					else {
						System.out.println("the DTI ratio is 40% or greater, the loan is denied");
					}
						
				}
				else {
					System.out.println("Loan Denied for Salary < 50K");
				}
				
//				System.out.println("IS Employed");
			} 
			else  { 
				System.out.println("Not Employed so the loan is denied");
			}

			
		}
		else {
			System.out.println("the loan is denied");
		}
		
	}

}
