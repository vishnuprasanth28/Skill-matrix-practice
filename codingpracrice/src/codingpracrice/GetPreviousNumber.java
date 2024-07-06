package codingpracrice;

import java.util.Arrays;
import java.util.Scanner;

public class GetPreviousNumber {

	public static void main (String[]args) {
		
		/*int[] numbers = {4,3,76,72,8};
		int n=76;
		int previousNumber=0;
		for(int i=0;i<numbers.length-1;i++) {
			if (numbers[i]==n && i==0 ) {
				
					previousNumber =numbers[numbers.length-1];
			}else if(numbers[i]==n && i!=0 ){
				previousNumber =numbers[i-1];
			}
		}
		System.out.println(previousNumber);
	}
	*/
		
		  int[] numbers = {4,3,7,6,72,8};
		  int[]  find= {7,6};
		  int ans=-1;
		 
		  for(int i=0;i<numbers.length-1;i++) {
			  if(numbers[i]==find[0] && numbers[i+1]==find[1]) {
				  ans=numbers[i-1];
			  }
		  }
		  System.out.println(Arrays.toString(numbers));
		  System.out.println(ans);
		
}

}