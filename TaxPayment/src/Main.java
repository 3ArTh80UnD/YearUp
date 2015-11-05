
public class Main 
{
	public static void main(String[] args)
	{
		Tinker Corey = new Tinker (730);
		System.out.println("");
		Corey.PayTaxes(.20);
		System.out.println("");
		Corey.FileTaxReturn();
		System.out.println("");
		
		Tailor Brandon = new Tailor (4730);
		System.out.println("");
		Brandon.PayTaxes(.19);
		System.out.println("");
		Brandon.FileTaxReturn();
		System.out.println("");
		
		Soldier Michael = new Soldier (19910);
		System.out.println("");
		Michael.PayTaxes(.55);
		System.out.println("");
		Michael.FileTaxReturn();
		System.out.println("");
		
		Spy Reginald = new Spy (66660);
		System.out.println("");
		Reginald.PayTaxes(.11);
		System.out.println("");
		Reginald.FileTaxReturn();
		System.out.println("");
		
		TaxAuditor Denzel = new TaxAuditor();
		Denzel.Audit(Corey);
		System.out.println("");
		Denzel.Audit(Brandon);
		System.out.println("");
		Denzel.Audit(Michael);
		System.out.println("");
		Denzel.Audit(Reginald);

	}
}