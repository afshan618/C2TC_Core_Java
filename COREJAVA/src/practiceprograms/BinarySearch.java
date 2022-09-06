package practiceprograms;

import java.util.Arrays;

public class BinarySearch {
public static void main(String[] args)
{
	int[] arr= {10,20,30,40,50,89,6,2,11,21};
	int key=11;
	Arrays.sort(arr);
	System.out.println("sorted array is: "+Arrays.toString(arr));
	System.out.println("sorted array is: "+Arrays.binarySearch(arr,key));
			
}}
