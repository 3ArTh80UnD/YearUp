
public class CalculateArea {

	public static void main(String[] args) {
		double areaInMainMethod = CalculateCircleArea(10);
		System.out.println(areaInMainMethod);

	}
	public static double CalculateCircleArea(int radius)
	{
		//This method calculates the area of a circle
		//Input: integer radius value
		//Output: double area
		
		double area = 3.14 * radius * radius;
		return area;
	}

}
