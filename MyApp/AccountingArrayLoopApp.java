
public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatrate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatrate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply - expense;
		
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT :"+(valueOfSupply*vatrate));
		System.out.println("Total :"+total);
		System.out.println("Expense :"+expense);
		System.out.println("Income :"+income);
		
		double [] dividendRates = new double [3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
	int i=0;	
	while(i < dividendRates.length)
	{
		System.out.println("Dividend :"+ (income*dividendRates[i]));
		i = i+1;
	}
	
	}

}
