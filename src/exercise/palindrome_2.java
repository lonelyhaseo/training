package exercise;

public class palindrome_2 {

	public static void main(String[] args) {
		System.out.println(checkPalindrome("asdsa"));

	}

	public static boolean checkPalindrome(String inputString) {
	    int l = inputString.length();
	    for(int i = 0; i<l/2;i++){
	        if(inputString.charAt(i) != inputString.charAt(l-1-i))
	            return false;
	    }
	    return true;
	}	
	
	
}
