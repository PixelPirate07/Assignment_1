import java.util.*;
public class Selfprob2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length"); 
		double l=sc.nextInt();
		System.out.println("Enter width");
		double w=sc.nextInt();
		double p=2*(l+w);
		System.out.println("Perimeter is "+p);
	}
}