*** 
three dimensional array
output:
organization no.:1
company no.:1
employees name:1

kav
employees name:2
kushi
company no.:2
employees name:1
mk
employees name:2
chandu
organization no.:2
company no.:1
employees name:1
hashi
employees name:2
amzu
company no.:2
employees name:1
danush
employees name:2
anu
organization no.:1
company no.:1
kav
kushi
company no.:2
mk
chandu
organization no.:2
company no.:1
hashi
amzu
company no.:2
danush
anu
***
import java.util.Scanner;
public class thred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String arr[][][]=new String[2][2][2];
		for(int i=0;i<2;i++){
		System.out.println("organization no.:"+(i+1));
		for(int j=0;j<2;j++){
		System.out.println("company no.:"+(j+1));
		for(int k=0;k<2;k++){
		System.out.println("employees name:"+(k+1));
		arr[i][j][k]=sc.next();
		}
		}
		}
		for(int i=0;i<2;i++){
		System.out.println("organization no.:"+(i+1));
		for(int j=0;j<2;j++){
		System.out.println("company no.:"+(j+1));
		for(int k=0;k<2;k++){
		System.out.println(arr[i][j][k]);
		}
		}
		}
	}

}
***
