***
one dimensional array
output:
enter the name of employees:1
kav
enter the name of employees:2
kushi
enter the name of employees:3
chandu
enter the name of employees:4
mk
enter the name of employees:5
amzu
kav
kushi
chandu
mk
amzu
***
import java.util.Scanner;
class oned{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String arr[]=new String[5];
for(int i=0;i<5;i++)
{
System.out.println("enter the name of employees:"+(i+1));
arr[i]=sc.next();
}
for(String name:arr)
{
System.out.println(name);
}
}
}
