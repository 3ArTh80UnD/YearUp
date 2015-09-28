
public class RectArea {

	public static void main(String[] args) {
		int RectArea = CalcRect(6, 9);
		System.out.println(RectArea);
		
	}
	public static int CalcRect(int a , int b)
	{
		//This method calculates the area of a rectangle
		//Input: length and width
		//Output: area
		
	    int area = a * b;
		return area;
	}
}
