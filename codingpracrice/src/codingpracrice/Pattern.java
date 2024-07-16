package codingpracrice;

public class Pattern {
	public static void main(String[] args) {
	
	String word ="hello";
	for(int i=0;i<=word.length()-1;i++) {
		for(int j=0;j<word.length()-i;j++) {
			System.out.print(word.charAt(j));
			
		}
		System.out.println();
		
		
	}
	}
}
