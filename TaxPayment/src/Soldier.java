
public class Soldier implements TaxPayer
{
	private double m_income = -1;
	private boolean m_donePayingTaxes = false;

	Soldier(double income)
	{
		SetIncome(income);
	}
	
	public double GetIncome()
	{
		return m_income;
	}
	
	private void SetIncome(double income)
	{
		m_income = income;
	}	
	
	public void PayTaxes(double taxRate) 
	{
		if (!m_donePayingTaxes)
		{
			double taxAmount = GetIncome() * taxRate;
			System.out.println("Soldier is paying the following tax: " + taxAmount);
			SetIncome(GetIncome() - taxAmount);
			System.out.println("My income after paying the following tax is: " + GetIncome());
			m_donePayingTaxes = true;
		}		
	}

	public void FileTaxReturn() 
	{
		if (m_donePayingTaxes)
		{
			System.out.println("Soldier is filing his tax return.");
		}		
	}
	
}
