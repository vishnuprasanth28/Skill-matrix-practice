package codingpracrice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example {
	
	public static void main (String[]args) {
		 
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the number of words: ");
		        int n = sc.nextInt();

		        sc.nextLine();

		        System.out.println("Enter the strings:");
		        String[] strArr = new String[n];
		        for (int i = 0; i < n; i++) {
		            strArr[i] = sc.nextLine();
		        }

		        String commonPrefixes = findCommonPrefixes(strArr);
		        System.out.println("Common prefixes:");
		        System.out.println(commonPrefixes);

		        sc.close();
		    }

		    public static String findCommonPrefixes(String[] strArr) {
		        List<String> commonPrefixes = new ArrayList<>();

		        for (int i = 0; i < strArr.length; i++) {
		            for (int j = i + 1; j < strArr.length; j++) {
		                String prefix = commonPrefix(strArr[i], strArr[j]);
		                if (!prefix.isEmpty() && !commonPrefixes.contains(prefix)) {
		                    commonPrefixes.add(prefix);
		                }
		            }
		        }

		        return String.join(" ", commonPrefixes);
		    }

		    public static String commonPrefix(String str1, String str2) {
		        int minLength = Math.min(str1.length(), str2.length());
		        StringBuilder prefix = new StringBuilder();

		        for (int i = 0; i < minLength; i++) {
		            if (str1.charAt(i) == str2.charAt(i)) {
		                prefix.append(str1.charAt(i));
		            } else {
		                break;
		            }
		        }

		        return prefix.toString();
		    }
	}
	


