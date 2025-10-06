package Level_01.lvl1_Ex2.classes;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateDniTest {

	@ParameterizedTest
	@ValueSource(ints = {71466987, 12342878 ,13172516, 71453503, 72080807
		,71463383, 71521120, 44490085, 53865310, 44435315})
	public void calculateDniTest(int numDni) {
		String charStr = "TRWAGMYFPDXBNJZSQVHLCKE";
		CalculateDni obj = new CalculateDni();
		assertEquals(String.valueOf(charStr.charAt(numDni % 23)),obj.calculateDni(numDni));
	}
}
