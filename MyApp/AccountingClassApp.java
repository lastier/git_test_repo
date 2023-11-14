class Accounting
{
	public static double valueOfSupply;
	public static double vatrate;
	public static double expenseRate;
	
	public double getDividend1()
	{
		return getIncome() * 0.5;
	}
	
	public double getDividend2()
	{
		return getIncome() * 0.3;
	}
	
	public double getDividend3()
	{
		return getIncome() * 0.2;
	}

	public double getIncome() 
	{
		return valueOfSupply - getExpense();
	}

	public double getExpense() 
	{
		return valueOfSupply*expenseRate;
	}

	public double getTotal() 
	{
		return valueOfSupply + getVAT();
	}

	public double getVAT() 
	{
		return valueOfSupply * vatrate; //메소드를 만드는곳
	}
	
	public void print() 
	{
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT :"+getVAT());
		System.out.println("Total :"+getTotal());
		System.out.println("Expense :"+getExpense());
		System.out.println("Income :"+getIncome());
		System.out.println("Dividened 1 :"+ getDividend1());
		System.out.println("Dividened 2 :"+ getDividend2());
		System.out.println("Dividened 3 :"+ getDividend3());
	}
}

class Accounting2
{
	public static double valueOfSupply;
	public static double vatrate;
	public static double expenseRate;
	
	public double getDividend1()
	{
		return getIncome() * 0.5;
	}
	
	public double getDividend2()
	{
		return getIncome() * 0.3;
	}
	
	public double getDividend3()
	{
		return getIncome() * 0.2;
	}

	public double getIncome() 
	{
		return valueOfSupply - getExpense();
	}

	public double getExpense() 
	{
		return valueOfSupply*expenseRate;
	}

	public double getTotal() 
	{
		return valueOfSupply + getVAT();
	}

	public double getVAT() 
	{
		return valueOfSupply * vatrate; //메소드를 만드는곳
	}
	
	public void print() 
	{
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT :"+getVAT());
		System.out.println("Total :"+getTotal());
		System.out.println("Expense :"+getExpense());
		System.out.println("Income :"+getIncome());
		System.out.println("Dividened 1 :"+ getDividend1());
		System.out.println("Dividened 2 :"+ getDividend2());
		System.out.println("Dividened 3 :"+ getDividend3());
	}
}


public class AccountingClassApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instance
		Accounting a1 = new Accounting();
		a1.valueOfSupply = 10000.0;
		a1.vatrate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.valueOfSupply = 20000.0;
		a2.vatrate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();
		
		a1.print();
		
	}

	
	
	

}
