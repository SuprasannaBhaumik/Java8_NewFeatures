import java.util.Scanner;

public class CollegeProblems {

	public static void main(String[] args) {
		System.out.println("Enter the no of terms for fibbo");
		
		Scanner sc = new Scanner(System.in);
		int terms = sc.nextInt();
		
		int factorial = 1;
		factorial = calculateFactorial(terms, factorial);
		System.out.println(terms + "! = " + factorial);
		
		String fibbonacci = showFibbonacci(terms);
		System.out.println("Fibbonacci series for " + terms + "terms = " + fibbonacci);
		sc.close();
	}

	public static String showFibbonacci(int terms) {
		StringBuffer result = new StringBuffer();
		int firstTerm=0;
		int secondTerm=1;
		
		if( terms > 2 ) {
			
		}
		return null;
	}

	public static int calculateFactorial(int terms, int factorial) {
		for(int i=1; i<=terms ; i++) {
			factorial *= i;
		}
		return factorial;
	}

}

