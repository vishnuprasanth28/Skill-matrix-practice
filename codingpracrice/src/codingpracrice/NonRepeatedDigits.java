package codingpracrice;

public class NonRepeatedDigits {
	
	 
		 
		 public static void main(String[] args) {
		     int start=10;
		     int end=25;
		     int count = 0;
		     for (int num = start; num <= end; num++) {
		         if (!hasRepeatDigits(num)) {
		             count++;
		         }
		     }
		     System.out.println("Number of non-repeat-digited numbers between "  + count);
		     
			}
		 
		 
		 public static boolean hasRepeatDigits(int num) { 
	        String numStr = Integer.toString(num);
	        for (int i = 0; i < numStr.length() - 1; i++) {
	            if (numStr.charAt(i) == numStr.charAt(i + 1)) {
	                return true;
	            }
	        }
	        return false;
	    }
	
}
