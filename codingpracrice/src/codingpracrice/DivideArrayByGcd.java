package codingpracrice;

import java.util.Arrays;

public class DivideArrayByGcd {

	public static void main(String[] args) {
		int[] array= {28,23,44,56,12};
		int gcd = getGcdOfArray(array);
		System.out.println("the gcd is :"+ gcd);
		for(int i=0;i<array.length;i++) {
			array[i]=array[i]/gcd;
			
		}
		System.out.println("Result :"+Arrays.toString(array));
	}
	
	public static int getGcdOfArray(int[] array) {
		int gcd =array[0];
		for(int i=1;i<=array.length;i++) {
			gcd =getGcd(gcd,array[i]);
			if(gcd==1) {
				break;
			}
		}
		return gcd;
		
	}
	public static int getGcd(int a, int b) {
		int min=(a>b)?a:b;
		int gcd=1;
		for(int i=2;i<=min;i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;
			}
		}return gcd;
	}
}
