package com.demo.service;

import java.util.Arrays;

public class ArrayService {

	
	
	//this is bubble sort algorithm
	public void BubbleSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

	//this is improved buble sort
	public void ImprovedBubbleSort(int[] arr) {
		int n=arr.length;
		int swapcount=0;
		for(int i=0;i<n;i++)
		{
			swapcount=0;
			for(int j=1;j<(n-i);j++)
			{
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapcount++;
				}
			}
			
			if(swapcount==0)
				break;
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

	public void QuickSort(int[] arr, int low, int high) {
		int i=low;
		int j=high;
		int pivot=low;
		if(low<=high)
		{
			while(i<j)
			{
			while(arr[i]<arr[pivot] && i<high)
			{
				i++;
			}
			while(j>=low && arr[j]>arr[pivot])
			{
				j--;
			}
			if(i<j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
			int temp=arr[j];
			arr[j]=arr[pivot];
			arr[pivot]=temp;
		
		System.out.println("iteration:"+low+" "+j);
		QuickSort(arr, low, j-1);
		QuickSort(arr, j+1, high);
		}
	}

	//this is insertion sort
	public void InsertionSort(int[] arr) {
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			int j=i-1;
			int key=arr[i];
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
		
		arr[j+1]=key;
		}
	}

	//this is merging algorithm
	public void Merge(int[] arr, int first, int mid, int last) {
		int i,j;
		int l1=mid-first+1;
		int l2=last-mid;
		
		int left[]=new int[l1];
		int right[]=new int[l2];
		
		i=0;
		for(int a=first;a<=mid;a++) {
			left[i]=arr[a];
			i++;
		}
		
		j=0;
		for(int a=mid+1;a<=last;a++) {
			right[j]=arr[a];
			j++;
		}
		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(right));
		
		i=0;
		j=0;
		int k=first;
		while(i<l1 && j<l2)
		{
			if(left[i]<right[j])
			{
				arr[k]=left[i];
				i++;
			}
			else {
				arr[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<l1)
		{
			arr[k]=left[i];
			i++;
			k++;
		}
		while(j<l2)
		{
			arr[k]=right[j];
			j++;
			k++;
		}
		System.out.println("Array : "+Arrays.toString(arr));
		
		
	}
	
	//this method call mergesort alogrithm it is used to divide and conquer 
	public void MergeSort(int arr[],int first,int last)
	{
		if(first<last)
		{
			int mid=(first+last)/2;
			
			MergeSort(arr, first, mid);
			MergeSort(arr, mid+1, last);
			Merge(arr, first, mid, last);
		}
		
	}

	public void SelectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}

	public void CountingSort(int[] arr) {
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			max=Math.max(arr[i],max);
		}
		int count[]=new int[max+1];
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			count[arr[i]]++;
		}

		for(int i=1;i<count.length;i++)
		{
			count[i]=count[i]+count[i-1];
		}
		
		int ans[]=new int[arr.length];
		for(int i=0;i<n;i++)
		{

			ans[count[arr[i]]-1]=arr[i];
			count[arr[i]]--;
		}
		
		System.out.println(Arrays.toString(ans));
	}

	
	public void HeapSort(int[] arr) {
		int n=arr.length;
		for(int i=(n/2)-1;i>=0;i--)
		{
			Heapify(arr, n, i);
		}
		for(int i=n-1;i>=0;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			Heapify(arr, i, 0);
		}
		
	}
	public void Heapify(int arr[],int n,int i)
	{
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		
		if(left<n && arr[left]>arr[largest])
		{
			largest=left;
		}
		if(right<n && arr[right]>arr[largest])
		{
			largest=right;
		}
		
		if(largest!=i)
		{
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			Heapify(arr, n, largest);
		}
		
	}
}
