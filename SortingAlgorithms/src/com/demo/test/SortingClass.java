package com.demo.test;
import java.util.Arrays;
import java.util.Scanner;
import com.demo.service.ArrayService;
public class SortingClass {

	public static void main(String[] args) {
		ArrayService asc = new ArrayService();
		int arr[]= {1,12,9,5,6,10};
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			
			System.out.println("1.Bubble Sort");
			System.out.println("2.Imporved Bubble Sort");
			System.out.println("3.Quick Sort");
			System.out.println("4.Insertion sort");
			System.out.println("5.Merge Sort");
			System.out.println("6.Selection Sort");
			System.out.println("7.Counting Sort");
			System.out.println("8.Heap Sort");
			System.out.println("9.Exit \n Enter Choice:");
			choice=sc.nextInt();
			switch(choice){
	
			case 1->{
				asc.BubbleSort(arr);
			}
			
			case 2->{
				asc.ImprovedBubbleSort(arr);
			}
			
			case 3->{
			
     				asc.QuickSort(arr,0,arr.length-1);
     				System.out.println(Arrays.toString(arr));
			}
			
			case 4->{
					asc.InsertionSort(arr);
					System.out.println(Arrays.toString(arr));
				
			}
			  
			case 5->{
					asc.MergeSort(arr,0,arr.length-1);
					System.out.println(Arrays.toString(arr));
			}
			
			
			case 6->{
					asc.SelectionSort(arr);
					System.out.println(Arrays.toString(arr));
			}
			
			case 7->{
					asc.CountingSort(arr);	
			}
			
			case 8->{
					asc.HeapSort(arr);
					System.out.println(Arrays.toString(arr));
			}
			
			case 9->{
					System.out.println("Thankyou for visiting ...");
					sc.close();
			}
		  }
		}while(choice!=5);

	}

}
