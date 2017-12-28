package basics;

public class fibonacis {
	
	public static void main(String[] args) {
	//Fibonacci number is defined by the sum of the two previous fibonacci numbers
	//fib(0) = 0
	//fib(1) = 1
	//fib(2) = fib(0) + fib(1) = 0 + 1 = 1
	//fib(3) = fib(1) + fib(2) = 1 + 1 = 2
	//fib(4) = fib(2) + fib(3) = 1 + 2 = 3
	//fib(5) = fib(3) + fib(4) = 2 + 3 = 2
	System.out.println(fib(100));
	}
	
	public static int fib(int a) {
		if(a == 0) {
			return 0;
		}else if(a == 1){
			return 1;
		}
		return (fib(a-1)+fib(a-2));
	}
}