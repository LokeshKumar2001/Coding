package strings;

public class LengthOfLastWord {
	//LeetCode: https://leetcode.com/problems/length-of-last-word/description/
	//Explanation: https://www.youtube.com/watch?v=EDEwDYYkC2E&list=PLjOcsOwEjb135TKtYNgd08hnioIV-C1rR
	
	public static int lengthOfTheLastWord(String s) {
		
		String str=s.trim();
		int count=0;
		
		for(int i=str.length()-1;i>=0;i--) 
			if(str.charAt(i)==' ') 
				break;
			else 
				count++;	
		
		return count;	
	}
	
	public static int lengthOfTheLastWord1(String s) {
		String[] words=s.split(" ");
		return words[words.length-1].length();
	}

	public static void main(String[] args) {
		String s="   fly me   to   the moon  ";
		int n=lengthOfTheLastWord(s);
		int n1=lengthOfTheLastWord1(s);
		System.out.println(n);
	}

}
