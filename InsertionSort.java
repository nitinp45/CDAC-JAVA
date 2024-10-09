import java.util.*;

class InsertionSort{
	
	public static void Sort(int arr[],int n){
		for(int i=1;i<n;i++){
		int key=arr[i];
		int j=i-1;
		while(j>=0 &&arr[j]>key){
		arr[j+1] = arr[j];
		j=j-1;
		}
		arr[j+1]=key;
	}	
	}
	
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of array");
	int n = sc.nextInt();
	int[] arr = new int[n];
	
	System.out.println("Enter Element");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();	
	}
	Sort(arr, n);
	System.out.println();
	for(int i=0;i<n;i++)
	{
		System.out.println(arr[i]);	
	}
}
}