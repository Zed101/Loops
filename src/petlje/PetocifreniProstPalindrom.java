package petlje;

public class PetocifreniProstPalindrom {

	public static void main(String[] args) {
		int temp = 0;
		boolean prost = true;
		for (int i = 10001; i < 100000; i++) {
			temp = i;
			prost = true;
			String palindrom = "";
			for (int j = 0; j < 5; j++) {

				palindrom += temp % 10;
				temp = temp / 10;
			}
			int palin = Integer.parseInt(palindrom);

			if (i == palin) {
				//System.out.println(i + " Number is palinrom");
				for (int j = 2; j < palin; j++) {
					
					if (i % j == 0) {
						//System.out.println(j + "nije prost");
						prost = false;
					}
				}
				if (prost == true) {
					System.out.println("Broj " + i + " prost je i palinrom" + prost);
				}
			}
		
		}

	}

}
