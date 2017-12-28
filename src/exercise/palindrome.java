package exercise;

public class palindrome {
	public static boolean checkPalindrome(String str) {
		return str.equals(new StringBuilder(str).reverse().toString());
	}
	
	public static void main(String[] args) {
		System.out.println(checkPalindrome("aasaa"));
		;
	}
}
