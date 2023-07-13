package Java_interview;

import java.util.Arrays;
import java.util.Iterator;

public class CountOccurance {
	public static void countoccurance(int arr[], int n)
	{
		boolean visited[] = new boolean [n];
		Arrays.fill(visited, false);
		//Traverse through array elements and 
		//count frequencies
		for (int i = 0; i < n; i++) {
			//skip this element if already processed
			if (visited[i] == true) 
				continue;
			//count frequency
			int count =1;
			for (int j = i+1; j < n; j++) {
				if (arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}
			}
			System.out.println(arr[i] + " " + "occurs" + " "+ count + " "+ "times");	
		}
	}
	//Driver code
	public static void main(String[] args) {
		int arr[] = new int[] {4,3,2,3,4,5,3,4,6,7,6,8,9};
		int n = arr.length;
		countoccurance(arr, n);
	}
}
