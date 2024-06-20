package packagesInJava;
import java.util.Scanner;

class Fruits
{
	public void apple()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Pleaase enter the number of apples you want to buy:");
		int appleCount=scan.nextInt();
		
		System.out.println("The no of apples are: " + appleCount); 
		
		scan.close();
		
		
	}

}

public class UseOfPackagesInsideJava 
{
	public static void main(String [] args)
	{
		Fruits f=new Fruits();
		f.apple();
		
	}
}
