
public class Accountingapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatrate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatrate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply - expense;
		double dividened1 = income * 0.5;
		double dividened2 = income * 0.3;
		double dividened3 = income * 0.2;
		
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
