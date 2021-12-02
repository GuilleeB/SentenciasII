
public class Ejercicio2 {

	public static void main(String[] args) {
		int sumador = 0;
		int multiplo = 1;
		for (int i = 1; i<=10; i++) {
			sumador = (sumador + i);
			
			multiplo = (multiplo * i);
		}
		System.out.println("la suma es " + sumador);
		System.out.println("el multiplo es " + multiplo);
		
	}

}
