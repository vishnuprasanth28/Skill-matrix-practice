package codingpracrice;

public class CommonPrefix {

	public static void main(String[] args) {
		String str[]= {"flower","flow","flight"};
		String ans= longestCommonPrefix(str);

		System.out.println("longest commonPrefix :"+ans);
	}
	
	
	
	 public static String longestCommonPrefix(String[] strs) {
		    
	        int minstrindex=0;
	       
	        int minstrlen=strs[0].length();
	        for(int i=1;i<strs.length;i++){
	            if(strs[i].length()<minstrlen){
	            
	                minstrlen=strs[i].length();
	                minstrindex=i;
	            }
	        }
	        int match=minstrlen;
	        for(int i=0;i<strs.length;i++) {
	            if(i==minstrindex){
	                continue;
	            }
	             int count=0;
	            for(int j=0;j<minstrlen;j++){
	             
	            
	                if(strs[i].charAt(j)==strs[minstrindex].charAt(j)){
	                    count++;
	                }
	                else{
	                    break;
	                }
	            }
	            if(count<match){
	                match=count;
	            }
	        }

	        String ans= strs[minstrindex];
	        return ans.substring(0,match);
	 }




}
