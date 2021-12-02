
public class Ejercicio3 {

	public static void main(String[] args) {
		int sumadorpar = 0;
		int sumadorimpar = 0;
		for (int i = 100; i < 201; i++) {
			if (i % 2 == 0) {
				sumadorpar += i;

			} else if (i % 2 != 0) {
				sumadorimpar += i;

			}
		}
		System.out.println("la suma de pares es "  + sumadorpar);
		System.out.println("la suma de impares es " + sumadorimpar);
	}
}

