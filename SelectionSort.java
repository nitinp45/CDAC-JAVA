import java.util.*;
class SelectionSort{
	
	public static void SelectionSorting(int arr[] , int n)
	{
		for(int i=0;i<n;i++)
		{
		int min = i;
			for(int j=i+1;j<n-1;j++)
			{
				if(arr[j]<arr[min])
					{
					min=j;
					
					}
				
				}
				int temp =arr[min];
				arr[min]=arr[i];
				arr[i]= temp;			
			}
	for(int j=0;j<n;j++)
	{
		System.out.println(arr[j]);
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
		SelectionSorting(arr, n);
	
	}
}