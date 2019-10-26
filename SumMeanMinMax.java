import java.util.Scanner;


public class SumMeanMinMax {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int n = a+b+c;
		double m = n/3;
		int max = 0;
		int min = 0;
		for (int i=0;i<a;i++) {
		int y = input.nextInt()
		if (i==0) {
		max = y;
		min = y;
		}
		else if (y>max) {
		max = y;
		}else if (y<min) {
		min = y;
		}
		else {continue;
		}
		System.out.println("the maximum number is "+max);
		System.out.println("the minimum number is "+min);
		}
		System.out.println(n,m);
		
		System.out.println("a: " + a + " b: " + b + " c: " + c);
		/*
		 * Todo: Print the sum, mean, max Value and min Value of a, b and c.
		 * */
		

	}

}
