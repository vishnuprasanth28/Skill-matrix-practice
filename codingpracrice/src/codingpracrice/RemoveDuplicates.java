package codingpracrice;

import java.util.Arrays;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
	     int arr[]= {5,6,2,5,6,3,4,4};
	     System.out.println(Arrays.toString(removeDuplicatesInArray(arr)));
	     System.out.println(Arrays.toString(arr));
	    

	}
	
	
	public static int[] removeDuplicatesInArray(int arr[]) {
		int index=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[index]=arr[i];
				index++;
			}
		}
		arr[index++]=arr[arr.length-1];
		return Arrays.copyOfRange(arr, 0, index);
	}
	
}
