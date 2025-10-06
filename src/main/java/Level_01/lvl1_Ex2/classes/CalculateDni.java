package Level_01.lvl1_Ex2.classes;

public class CalculateDni {

	public void start() {
		int numDni = 53867839;
		System.out.println("The " + numDni + " has the letter " + calculateDni(numDni));
	}

	public String calculateDni(int numDni) {
		final String charStr = "TRWAGMYFPDXBNJZSQVHLCKE";
		String result = "";
		if (numDni < 0) {
			throw new IllegalArgumentException("The number " + numDni + " can't be negative");
		}
		else
		{
			result = String.valueOf(charStr.charAt(numDni % 23));
		}
		return result;
	}
}
