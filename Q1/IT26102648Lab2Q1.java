public class IT26102648Lab2Q1{
	public static void main(String[]args){
		int perimeter;
		double width,length,width_ratio;
		perimeter = 100;
		width_ratio = 0.75;
		//width =0.75*length
		//perimeter =2((width_ratio*length)+length)
		//perimeter = 2(width_ratio+1)length
		//length = perimeter/(2*(1+width_ratio))
		
		length = perimeter/(2*(1+width_ratio));
		width = width_ratio*length;
		//output
		System.out.println("Length of the fence: " + length);
		System.out.println("Width of the fence: " + width);
	}
}