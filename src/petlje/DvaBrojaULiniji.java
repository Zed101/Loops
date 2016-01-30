package petlje;

public class DvaBrojaULiniji {

	public static void main(String[] args) {
		
		TextIO reader = new TextIO();
		reader.readFile("numbers.in");
		int prviB = reader.getInt();
		//System.out.println("Ovo je prvi broj iz prve linije " + prviB );
		int drugiB = reader.getInt();
		//System.out.println("Ovo je drugi broj iz prve linije " + drugiB);
		int counter = 0;
		while(prviB != 0){
			prviB--;
			int drugiBr = reader.getInt();
			//System.out.println(drugiBr);
			
			if(drugiBr == drugiB){
				counter++;
				System.out.println("Broj " + drugiB + " postoji");
			}
		}
		System.out.println("Broj " + drugiB + " ponavlja se " + counter + " puta");

	}

}
