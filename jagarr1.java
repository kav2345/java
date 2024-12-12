***
1d jagged array
output:
enter no.of companies:
2
employes in company  no.:1
2
employes in company  no.:2
3
inside company no.:1
enter the name of employee no.:1
kav
enter the name of employee no.:2
kushi
inside company no.:2
enter the name of employee no.:1
mk
enter the name of employee no.:2
mani
enter the name of employee no.:3
danush
inside company no.:1
kav
kushi
inside company no.:2
mk
mani
danush
***
import java.util.Scanner;
public class jagarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of companies:");
		int m=sc.nextInt();
		String arr[][]=new String[m][];
		for(int i=0;i<m;i++){
		System.out.println("employes in company  no.:"+(i+1));
		arr[i]=new String[sc.nextInt()];
		}
		for(int i=0;i<arr.length;i++){
		System.out.println("inside company no.:"+(i+1));
		for(int j=0;j<arr[i].length;j++)
		{
		System.out.println("enter the name of employee no.:"+(j+1));
		arr[i][j]=sc.next();
		}
		}
		for(int i=0;i<arr.length;i++){
		System.out.println("inside company no.:"+(i+1));
		for(int j=0;j<arr[i].length;j++)
		{
		System.out.println(arr[i][j]);
		}
		}

	}

}
***
