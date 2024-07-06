package codingpracrice;

/*
 We define the rating for Alice's challenge to be the triplet a = (a[0],a[1],a[2]), and the rating for Bob's challenge to be the triplet b = (b[0],b[1],b[2]).
Your task is to find their comparison points by comparing a[i] with b[i]
if a[i] > b[i] - alice is awarded 1 point
if a[i] < b[i] - bob is awarded 1 point
if a[i] = b[i] - then neither person receives a point.
*/
public class Triplet {

	public static void main (String[]args) {
		int[] a = {2,7,6};
		int[] b = {3,4,9};
		int countOfA=0;
		int countOfB=0;
		for(int i=0;i<=2;i++) {
			if(a[i]>b[i]) {
				countOfA++;
			}else if(a[i]<b[i]) {
				countOfB++;
			
		}
			
		
	}
		System.out.println("points of A :"+countOfA);
		System.out.println("points of B :"+countOfB);
}
}
