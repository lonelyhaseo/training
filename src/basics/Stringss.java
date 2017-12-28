package basics;

public class Stringss {
		
	public static void main(String[] args) {
		String t;
		t = "Buku Baru";
		
		if(t.contains("Baru")){
			System.out.println("Ini Buku Baru");
			System.out.println("______________");
		}			
		
		/*String a = "Browser";
		if(a.equalsIgnoreCase("browser")) {
			System.out.println("This is Browser");
		}*/
		
		String aN = "Jimmy";
		String lN = "Michale";
		String al = "27122011";
		
		System.out.print(aN.substring(0,1));
		System.out.print(lN.substring(0,1));
		System.out.print(al.substring(4));
		
	}
}
