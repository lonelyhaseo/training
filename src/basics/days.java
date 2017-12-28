package basics;

public class days {
		public static void main(String[] args) {
			String daysOftheweek = "Tuesday";
			System.out.println(daysOftheweek.toLowerCase());
		
			switch	(daysOftheweek) {
			case "Sunday" :
				System.out.println("Today Is Sunday");
				break;
			case "Monday" :
				System.out.println("Today Is Monday");
				break;
			case "Tuesday" :
				System.out.println("Today Is Tuesday");
				break;
			case "Wednesday" :
				System.out.println("Today Is Wednesday");
				break;
			case "Thursday" :
				System.out.println("Today Is Thursday");
				break;
			case "Friday" :
				System.out.println("Today Is Friday");
				break;
			case "Saturday" :
				System.out.println("Today Is Saturday");
				break;	
			}			
		}
}
