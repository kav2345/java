***
high,low,sum
output:
70
5
20
10
***
public class hls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,20,5,70};
		int max=arr[0];
		int min=arr[0];
		int sum=0;
		for(int i=0;i<arr.length;i++){
		if(arr[i]>max){
		max=arr[i];
		}
		if (arr[i]<min){
		min=arr[i];
		}
		}
		System.out.println(max);
		System.out.println(min);
		for(int i=0;i<arr.length;i++){
		sum+=arr[i];
		}
		System.out.println(sum);
		for(int i=3;i>=0;i--){
		System.out.println(arr[i]);
		}
	}

}
