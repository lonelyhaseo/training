package basics;

public class Rekursif_2 {
	public static void main(String[] args) {
		//Program ini untuk menampilkan hasil penambahan dari angka 1 sampai angka N
				
		System.out.println(plus(5));
	}
	
	static int plus(int a) {
		if(a == 0) {
			return 0;
		}
		
		if(a == 1) {
			return 1;
		}
		return(a + plus(a-1));
	}
}
