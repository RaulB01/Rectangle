import java.util.Scanner;
public class Rectangle{
	public static void main(String [] args){
		int perimeter, area, length, width;
		
		Scanner keyboard1 = new Scanner(System.in);
		Scanner keyboard2 = new Scanner(System.in);

		System.out.println("Enter the rectangles length: ");
		length = keyboard1.nextInt();
		System.out.println("Enter the rectangles width: ");
		width = keyboard2.nextInt();

		perimeter = (2*length + 2*width);
		area = (length * width);

		
		System.out.println("The Perimter is: " + perimeter + "" 
				     + "The Area is: " + area);


}
}