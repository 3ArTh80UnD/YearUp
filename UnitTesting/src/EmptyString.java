
public class EmptyString 
{
	boolean  m_emptyString = false;
	
	public boolean emptyString(String one)
	{
		if (one != null)
		{
			m_emptyString = one.equals("");
			return m_emptyString;		}
		else
		{
			return false;
		}
	}


}
