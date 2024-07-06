package codingpracrice;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
        int arr[]={4,5,3,7,1};
       int copy[] =Arrays.copyOf(arr, arr.length);
       System.out.println("original array "+Arrays.toString(arr));
        Arrays.sort(copy);
        System.out.println("sorted array"+Arrays.toString(copy));
      for(int i=0;i<copy.length;i++) {
      	for(int j=0;j<arr.length;j++) {
      		if(copy[i]==arr[j]) {
      			System.out.print(j+" ");
      		}
      	}
      }
      	
	}
	
}
