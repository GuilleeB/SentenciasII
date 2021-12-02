import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cant;
		int num;
		int mayor;
		int menor;
		do {
			System.out.println("Numero de veces a ejecutar: ");
			cant = sc.nextInt();
		} while (cant <= 1 || cant >= 100);
		mayor = Integer.MIN_VALUE;
		menor = Integer.MAX_VALUE;

		for (int i = 1; i <= cant; i++) {
			System.out.println("Escribe un numero: ");
			num = sc.nextInt();
			if (num > mayor) {
				mayor = num;
			}
			if (num < menor) {
				menor = num;
			}
		}
		System.out.println("el numero mas alto es " + mayor);
		System.out.println("el numero mas bajo es " + menor);
	}
}
