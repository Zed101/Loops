package petlje;

import java.util.Scanner;

public class SumaSvihDjelioca {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter one natural number");
		int prirodnib = scan.nextInt();
		int suma = 0;
		while (prirodnib != 0) {
			if (prirodnib < 0) {
				System.out.println("Enter correct number");
			}
			for (int i = 1; i <= prirodnib; i++) {

				if (prirodnib % i == 0) {
					// System.out.println(i + "Djeljiv sa p");
					System.out.println("sum " + suma + " + broj " + i);

					suma += i;
				}

			}
			System.out.println(suma + " suma");
			suma = 0;
			System.out.println("Enter one natural number");
			prirodnib = scan.nextInt();
		}
		System.out.println("jyhj");
	}

}
