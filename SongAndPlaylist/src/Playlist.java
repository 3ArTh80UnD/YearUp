
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
		m_song[0] = new Song(3, "hello", "Rj");
		m_song[1] = new Song(8, "world", "Rj");
		m_song[2] = new Song(1, "my", "Rj");
		m_song[3] = new Song(2, "name", "Rj");
		m_song[4] = new Song(7, "is", "Rj");
		m_song[5] = new Song(10, "reginald", "Rj");
		m_song[6] = new Song(4, "wendell", "Rj");
		m_song[7] = new Song(6, "smith", "Rj");
		m_song[8] = new Song(9, "junior", "Rj");
		m_song[9] = new Song(5, "Ok", "Rj");
	}
	
	public static void DisplayPlaylist()
	//Prints out the song's name, rank, then artist.
	{
		for (int i = 0; i < m_song.length; i++)
		{
			String name = m_song[i].GetName();
			String artist = m_song[i].GetArtist();
			int rank = m_song[i].GetRanking();
			System.out.println("The song name is: " + name + ". " + "The song's rank is: " + rank + ". " + "The song's artist is: " + artist + ".");
		}
	}
}
