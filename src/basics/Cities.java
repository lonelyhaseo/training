package basics;

public class Cities {
	//declare and define an array
	public static void main(String[] Args) {
	String[] kota = {"New York", "Miami", "dallas"};
	
	System.out.println(kota[0]);
	System.out.println(kota[1]);
	System.out.println(kota[2]);
	
	//Declare an array
	String[] state = new String[5];
	state[0] = "LALA";
	state[1] = "LALAs";
	state[2] = "LALAd";
	state[3] = "LALAf";
	state[4] = "LALAg";
	
	/*int i = 0;
	do {
		System.out.println(state[i]);
		i = i + 1;
	}while(i<4);*/
	
	for(int i=0;i< state.length;i++) {
		System.out.println(state[i]);
	}
	}
}
