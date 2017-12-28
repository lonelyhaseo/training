package exercise;

public class arrays {
	public static void main(String[] args) {
			int [][] nir = {{0,0},{1,1},{2,2}};
			String alls = "";
			
			for(int row = 0;row < nir.length;row++) {
				for(int coloumn = 0; coloumn < nir[row].length;coloumn++)
				alls += nir[row][coloumn] + " ";
				alls += "\n";
			}
			
			System.out.println(alls);
	}
}
