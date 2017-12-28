package basics;

public class Rekursif_array {
	public static void main(String[] args) {
		int[] asd = {1,2,3,4,5};
		//int[] a = new int[5];
		System.out.println("Max number is "+max(asd)+"\nMin number is "+min(asd)+"\nAnd the average is "+average(asd));
	}
	
	static int max(int a[]) {
		int max = a[0];
		for(int i =1; i<a.length;i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}
	
	static int min(int a[]) {
		int min = a[0];
		for(int i =1; i<a.length;i++) {
			if(min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}
	
	static int average(int a[]) {
		int avg = a[0];
		for(int i =1; i<a.length;i++) {
			avg = avg + a[i];
		}
		return avg/a.length;
	}
}
