
public class EmptyString 
{
	boolean  m_emptyString = false;
	
	public boolean emptyString(String one)
	{
		m_emptyString = one.equals("");
		return m_emptyString;
	}


}
