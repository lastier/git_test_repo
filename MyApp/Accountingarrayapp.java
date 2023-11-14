
public class Accountingarrayapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatrate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatrate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply - expense;
		
		double [] dvidendRates = new double [3];
		dvidendRates[0] = 0.5;
		dvidendRates[1] = 0.3;
		dvidendRates[2] = 0.2;
		
		double dividened1 = income * dvidendRates[0];
		double dividened2 = income * dvidendRates[1];
		double dividened3 = income * dvidendRates[2];
		
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT :"+(valueOfSupply*vatrate));
		System.out.println("Total :"+total);
		System.out.println("Expense :"+expense);
		System.out.println("Income :"+income);
		System.out.println("Dividened 1 :"+ dividened1);
		System.out.println("Dividened 2 :"+ dividened2);
		System.out.println("Dividened 3 :"+ dividened3);
		
		
		
		

	}

}
