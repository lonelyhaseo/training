package basics;

public class Rekursif_3 {
	public static void main(String[] args) {
		System.out.println(kali(-1));
	}
	
	static int kali(int a) {
		if(a <= 0) {
			return 0;
		}
		
		if(a == 1) {
			return 1;
		}
		
		return(a * kali(a-1));
	}
	}