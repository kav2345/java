***
two dimensional array
output:
enter employees name:1
kav
enter employees name:2
kushi
enter employees name:3
mk
enter employees name:4
mani
enter employees name:1
pari
enter employees name:2
hashi
enter employees name:3
chandu
enter employees name:4
geeth
company no:1
kav
kushi
mk
mani
company no:2
pari
hashi
chandu
geeth
***
import java.util.Scanner;
public class twod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String arr[][]=new String[2][4];
		for(int i=0;i<2;i++){
		for(int j=0;j<4;j++){
		System.out.println("enter employees name:"+(j+1));
		arr[i][j]=sc.next();
		}
		}
		for(int i=0;i<2;i++){
		System.out.println("company no:"+(i+1));
		for(int j=0;j<4;j++){
		System.out.println(arr[i][j]);
		}
		}
	}

}
