
public class Playlist 
{
	static Song[] m_song = new Song[10];

	public static void main(String[] args) 
	{
		InitializePlaylist();
		DisplayPlaylist();
	}

	public static void InitializePlaylist()
	//Populates the spaces of the m_song array.
	{
		m_song[0] = new Song(3, "Hello", "Rj");
		m_song[1] = new Song(8, "World", "Rj");
		m_song[2] = new Song(1, "My", "Rj");
		m_song[3] = new Song(2, "Name", "Rj");
		m_song[4] = new Song(7, "Is", "Rj");
		m_song[5] = new Song(10, "Reginald", "Rj");
		m_song[6] = new Song(4, "Wendell", "Rj");
		m_song[7] = new Song(6, "Smith", "Rj");
		m_song[8] = new Song(9, "Junior", "Rj");
		m_song[9] = new Song(5, "Ok", "Rj");
	}
	
	public static void DisplayPlaylist()
	//Makes sure the array isn't null, then prints out the song's name, rank, then artist.
	{
		if (m_song != null)
		{
			for (int i = 0; i < m_song.length; i++)
			{
				String name = m_song[i].GetName();
				String artist = m_song[i].GetArtist();
				int rank = m_song[i].GetRanking();
				System.out.println("This is song number " + i + ". " + "The song name is " + name + ". " + "The song's rank is " + rank + ". " + "The song's artist is " + artist + ".");
			}
		}
	}
}
