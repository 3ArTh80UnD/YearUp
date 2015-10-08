
public class Person 

{
	private String m_name = null;
	private int m_age = 0;
	private String m_phoneNumber = null;
	private String m_address = null;

	Person(String name, int age, String phoneNumber, String address)
	{
		SetName(name);
		SetAge(age);
		SetNumber(phoneNumber);
		SetAddress(address);
	}
	
	String GetName()
	{
		return m_name;
	}
	
	private void SetName(String name)
	{
		m_name = name;
	}
	
	int GetAge()
	{
		return m_age;
	}
	
	private void SetAge(int age)
	{
		m_age = age;
	}
	
	String GetNumber()
	{
		return m_phoneNumber;
	}
	
	private void SetNumber(String phoneNumber)
	{
		m_phoneNumber = phoneNumber;
	}
	
	String GetAdress()
	{
		return m_address;
	}
	
	private void SetAddress(String address)
	{
		m_address = address;
	}
	
	void GrowsOlder()
	{
		int currentAge = GetAge();
		SetAge(currentAge + 1);
	}
}
