***
sorting
output:
not sorted
***
public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,2,3,4};
		boolean sorted=false;
		for(int i=0;i<3;i++)
		{
			if(arr[i]<arr[i+1])
			{
				//System.out.println("sorted");
				sorted=true;
			}
			else {
				System.out.println("not sorted");
				sorted=false;
				break;
			}
		}
		if(sorted==true) {
			System.out.println("sorted");
		}
	}
}
***
