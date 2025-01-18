import java.util.*;
public class Selfprob3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base"); 
		int b=sc.nextInt();
		System.out.println("Enter exponent");
		int e=sc.nextInt();
		int p=(int)Math.pow(b,e);
		System.out.println("Power calculation is "+p);
	}
}