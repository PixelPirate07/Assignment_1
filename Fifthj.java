import java.util.*;
public class Fifthj{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius"); 
		double r=sc.nextInt();
		System.out.println("Enter height");
		double h=sc.nextInt();
		double v=3.14*r*r*h;
		System.out.println("Volume of cylinder is "+v);
	}
}