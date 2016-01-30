package petlje;

public class CharZagrade {

	public static void main(String[] args) {

		String z = "}{}{{}{";
				
		char open = 'i';
		char close = 'j';
		boolean exit = true;
		int counter = 0;
		int counter1 = 0;
		int bracCount = 0;
	

		// TODO calc open bracces
		for (int j = 0; j < z.length(); j++) {
			if (z.charAt(j) == '{'){
				bracCount++;
			}
		}
		bracCount = bracCount - 1;
		System.out.println(bracCount + " broj otvorenh zagrada");

		for (int i = 0; i < z.length(); i++) {
			if (z.charAt(i) == '{') {
				bracCount--;
				counter++;
				open = z.charAt(i);
				 System.out.println(open + "ovorena zagrada" +bracCount);
			}
			
			
			
			
			
			
			if (z.charAt(i) == '}') {
				if (bracCount > 0) {
					counter1++;
					close = z.charAt(i);
					System.out.println(close + " zatvorena zagrada");
				} else {
					break;
				}				
				}
			
		}
		
	
		
		
		
		if (counter == counter1) {
			exit = true;
			System.out.println(exit);
		} else {
			exit = false;
			System.out.println(exit);
		}

		//System.out.println(counter + " broj otovrenih zagrada");
		//System.out.println(counter1 + " broj zatvorenih zagrada");

	}

}
