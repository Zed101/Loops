package petlje;

public class Zadatak2 {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		int c = 5;
		
		System.out.println("Pocetne vrijednosti: a = " + a + ", b = " + b + ", c = " + c);
		
		while (c > a && c > b) {
			c--;
			a++;
		}
		System.out.println("Na kraju prve petlje: a = " + a + ", b = " + b + ", c = " + c);
		
		do {
			a++;
			b++;
			c--;
		} while (a < c || b < c);
		
		System.out.println("Na kraju druge petlje: a = " + a + ", b = " + b + ", c = " + c);

	}

}
