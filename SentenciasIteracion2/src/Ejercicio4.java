import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Imprime un numero: ");
		double num = in.nextDouble();
		int exp = in.nextInt();
		double result = 1;
		for (int i = 0; i < exp; i++) {
			result *=num;
			
		}
		String
		formattedString = String.format ("%.02f", result);
		System.out.println("Este es el resultado " + formattedString);
		

	}

}
