package petlje;

public class BoraZadatak {

	public static void main(String[] args) {
		TextIO reader = new TextIO();
		reader.readFile("text.in");
		String text = "";
		int counter = 0;

		while (!reader.eof()) {
			text += reader.getln();

			// System.out.println(text);

		}
		for( int i = 0; i < text.length(); i++){
		if(text.charAt(i) == '1'){
			counter++;
		}
		}
		System.out.println("broj 1 se nalazi " + counter + " puta");
		System.out.println(text);

		TextIO writer = new TextIO();
		writer.writeFile("write.out");
		writer.putln("cifra 1 se ponavlja" + counter + " puta");

		System.out.println();

	}

}
