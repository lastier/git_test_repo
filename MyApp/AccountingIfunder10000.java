
public class AccountingIfunder10000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatrate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatrate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply - expense;
		
		double dividend1;
		double dividend2;
		double dividend3;
		
		if(income > 10000.0)
		{
			dividend1 = income * 0.5;
			dividend2 = income * 0.3;
			dividend3 = income * 0.2;
		}
		else
		{
			dividend1 = income * 1.0;
			dividend2 = income * 0;
			dividend3 = income * 0;
		}
		
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT :"+(valueOfSupply*vatrate));
		System.out.println("Total :"+total);
		System.out.println("Expense :"+expense);
		System.out.println("Income :"+income);
		String divdidened1;
		System.out.println("Dividened 1 :"+ dividend1);
		String divdidened2;
		System.out.println("Dividened 2 :"+ dividend2);
		System.out.println("Dividened 3 :"+ dividend3);
		
		
		
		

	}

}
