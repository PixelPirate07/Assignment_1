import java.util.*;
public class Third{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Temp. in Celcius"); 
		double c=sc.nextInt();
		double f=(c*9/5)+32;
		System.out.println("Temp. in Fahrenheit is "+f);
	}
}