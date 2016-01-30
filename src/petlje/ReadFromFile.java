package petlje;

public class ReadFromFile {

	public static void main(String[] args) {

		TextIO file = new TextIO();
		file.readFile("input.in");
		int brojstart = 0;
		int brojfinish = 0;

		brojstart = file.getInt();
		System.out.println(brojstart);
		brojfinish = file.getInt();
		System.out.println(brojfinish);
		System.out.println();
		
		
		for (int i = brojstart+1; i < brojfinish; i++) {
			System.out.println(i);
		}

	}

}
