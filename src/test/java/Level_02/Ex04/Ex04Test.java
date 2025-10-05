package Level_02.Ex04;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;

/*Crea un arrayList contenidor de diversos tipus d'objectes (crea'ls també).
Escriu una asserció per a verificar l'ordre
dels objectes en l'ArrayList segons han estat inserits.

    Ara verifica que la llista anterior conté els objectes en qualsevol ordre.
    Verifica que, en la llista anterior, un dels objectes s'ha afegit només una
    vegada. Deixa un dels elements sense afegir, i verifica que la llista no conté aquest últim.*/
public class Ex04Test {
	@Test
	public void verifyOrder() {
		ArrayList<Fruit> fruits = new ArrayList<Fruit>();
		fruits.add(new Apple());
		fruits.add(new Orange());
		fruits.add(new Grape());
		Assertions.assertThat(fruits).;
	}
}
