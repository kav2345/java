***
jagged array 2d
output:
enter organisation no:
2
enter the no.of companies:
2
entr employees in organization no.:1company no:1
1
entr employees in organization no.:1company no:2
2
entr employees in organization no.:2company no:1
1
entr employees in organization no.:2company no:2
2
inside organization no.:1
inside company no.:1
enter the name of employee name:1
kav
inside company no.:2
enter the name of employee name:1
mk
enter the name of employee name:2
mani
inside organization no.:2
inside company no.:1
enter the name of employee name:1
kushi
inside company no.:2
enter the name of employee name:1
danush
enter the name of employee name:2
pari
inside organization no.:1
inside company no.:1
kav
inside company no.:2
mk
mani
inside organization no.:2
inside company no.:1
kushi
inside company no.:2
danush
pari
***
import java.util.Scanner;
public class jagarr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter organisation no:");
		int m=sc.nextInt();
		System.out.println("enter the no.of companies:");
		int n=sc.nextInt();
		String arr[][][]=new String[m][n][];
		for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
		System.out.println("entr employees in organization no.:"+(i+1)+"company no:"+(j+1));
		arr[i][j]=new String[sc.nextInt()];
		}
		}
		for(int i=0;i<arr.length;i++){
		System.out.println("inside organization no.:"+(i+1));
		for(int j=0;j<arr[i].length;j++)
		{
		System.out.println("inside company no.:"+(j+1));
		for(int k=0;k<arr[i][j].length;k++){
		System.out.println("enter the name of employee name:"+(k+1));
		arr[i][j][k]=sc.next();
		}
		}
		}
		for(int i=0;i<arr.length;i++){
		System.out.println("inside organization no.:"+(i+1));
		for(int j=0;j<arr[i].length;j++)
		{
		System.out.println("inside company no.:"+(j+1));
		for(int k=0;k<arr[i][j].length;k++){
		System.out.println(arr[i][j][k]);
		}
		}
		}

	}

}
***
