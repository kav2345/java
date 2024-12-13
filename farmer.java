***
farmer program
output:
enter the principle amount
50000
enter time in years:
2
the simple interest is:2500.0
****
import java.util.Scanner;
import java.util.scanner;
public class farmer {
	double principle;
	static double rate;
	double time;
	double SimpleInterest;
	static
	{
		rate=2.5;
	}
	void Collectdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the principle amount");
		principle=sc.nextDouble();
		System.out.println("enter time in years:");
		time=sc.nextDouble();
	}
	void Calculate()
	{
		SimpleInterest=(principle*time*rate)/100;
	}
	void display()
	{
		System.out.println("the simple interest is:"+SimpleInterest);
	}
}
public class launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		farmer f=new farmer();
		f.Collectdata();
		f.Calculate();
		f.display();
	}

}
****
