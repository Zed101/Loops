package petlje;

public class SavrsenBroj {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 10000000; i < 1000000000; i++) {

			sum = 0;
			//System.out.println(i);
			for (int j = 1; j < i; j++) {

				if (i % j == 0) {
				//	System.out.println(j + " djeljiv s");
					sum += j;
				//	System.out.println(sum + " ovo je suma djeljivih");
				}
				
			}
			if (i == sum) {
				System.out.println("Magicni broj" + i);

			}

		}

	}

}
