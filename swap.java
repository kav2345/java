***
swap
output:
b=[70,5,20,10]
***
public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,5,70};
		int start=0;
		int end=3;
		System.out.print("b=[");
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;	
		}
		for(int i=0;i<=3;i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}

}
***
