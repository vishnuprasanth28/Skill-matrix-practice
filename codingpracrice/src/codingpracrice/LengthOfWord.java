package codingpracrice;

public class LengthOfWord {

	public static void main(String[] args) {
        String words="welcome All";
        if(words.contains(" ")) {
        	  String[] word=words.split(" ");
              System.out.println("length of last word in the string "+word[word.length-1].length()  );

        }
        else {
        	System.out.println(" 0");
        }
	}


}
