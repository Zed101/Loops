package petlje;

public class NameSurname2ForLOOp {

	public static void main(String[] args) {

		String web = "www.edfdffsdgg.com?name=Boris&surname=Prezime";
		boolean writeName = false;
		boolean writeSurname = false;
		boolean canWrite = true;
		String name = "";
		String surname = "";

		for (int i = 0; i < web.length(); i++) {
			if (web.charAt(i) == '&') {
				writeName = false;
				canWrite = false;
				writeSurname = true;
			}

			if (writeName == true && canWrite == true) {
				name += web.charAt(i);
			}

			if (writeName && writeSurname) {
				surname += web.charAt(i);
			}

			if (web.charAt(i) == '=') {
				writeName = true;
			}

		}
		
		
		System.out.println(name);
		System.out.println(surname);
	}

}
