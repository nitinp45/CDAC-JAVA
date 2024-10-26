package com.test.service;

public class ArrayService {

	public int SearchBySequential(int[] arr, int val) {
		 int n=arr.length;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==val)
			{
				return i;
			}
		}
		return -1;
	}

	public int BinarySearch(int low, int high, int[] arr1, int val) {
		int l=low;
		int h=high;
		
		if(l<=h)
		{
			int mid=(l+h)/2;
			if(arr1[mid]==val)
			{
				return mid;
			}
			else if(val > arr1[mid])
			{
				return BinarySearch(mid+1, h, arr1, val);
			}
			else if(val < arr1[mid]){
				return BinarySearch(l, mid-1, arr1, val);
			}
		}
		
		return -1;
	}

	public int Factorial(int num) {
		if(num==1)
			return 1;
		return num * Factorial(num-1);
	}

	public int FindPrimeSum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(!isPrime(arr[i]))
			{
				sum+=arr[i];
			}
			
		}
		return sum;
		
	}

	private boolean isPrime(int num) {
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				return true;
			}
		}
		return false;
	}

	public int FindSecondMax(int[] arr) {
//		int max=arr[0];
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]>max)
//			{
//				max=arr[i];
//			}
//		}
//		int second_largest=Integer.MIN_VALUE;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]>second_largest && arr[i]!=max)
//			{
//				second_largest=arr[i];
//			}
//		}
//		return second_largest;
//	}
		int max=arr[0], smax=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				smax=max;
				max=arr[i];
			}
			if(arr[i]<max && arr[i]>smax) {
				smax=arr[i];
			}
		}
		return smax;

	}

	public int FindSecondMin(int[] arr1) {
		int min=arr1[0],smin=arr1[0];//3 3
		for(int i=1;i<arr1.length;i++)
		{
			if(arr1[i]<min) //6 <3
			{
				smin=min;
				min=arr1[i];
			}
			if(arr1[i]<smin && arr1[i]>min)
			{
				smin=arr1[i];
			}
		}
		return smin;
	}
//		int max=arr1[0],smin=0;
//		for(int i=0;i<arr1.length;i++)
//		{
//			if(arr1[i]<max)
//			{
//				max=arr1[i];
//			}
//		}
//		int second_largest=Integer.MAX_VALUE;
//		for(int i=0;i<arr1.length;i++)
//		{
//			if(arr1[i]<second_largest && arr1[i]!=max)
//			{
//				second_largest=arr1[i];
//			}
//		}
//		return second_largest;
//	}
	}
