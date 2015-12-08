
public class Song 
{
	private String m_songName = null;
	private int m_ranking = 0;
	private String m_artist = null;
	
	public String GetName()
	{
		return m_songName;
	}
	
	public int GetRanking()
	{
		return m_ranking;
	}
	
	public String GetArtist()
	{
		return m_artist;
	}
	
	private void SetName(String newName)
	{
		m_songName = newName;
	}
	
	private void SetRank(int newRank)
	{
		m_ranking = newRank;
	}
	
	private void SetArtist(String newArtist)
	{
		m_artist = newArtist;
	}
	
	public Song(int ranking, String name, String artist)
	{
		SetRank(ranking);
		SetName(name);
		SetArtist(artist);
	}
}
