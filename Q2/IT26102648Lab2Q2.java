public class IT26102648Lab2Q2{
	public static void main(String[]args){
		int length,perimeter;
		double PI,radius;
		length=10;
		PI=3.14;
		//calculating the perimeter of the square
		perimeter = 4*length;
		
		// circumfererance = 2*3.14*radius
		radius=perimeter/(2*PI);
		
		//output
		System.out.println("Radius of the circular fence: "+ radius);
	}
}