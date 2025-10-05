package Level_01.Lvl1_Ex3.classes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;

/*Crea una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException.
    Verifica el seu correcte funcionament amb un test jUnit.*/
public class OutOfBoundsTest {
	@Test
	public void throwOutOfBoundsTest() {
	OutOfBounds obj = new OutOfBounds();
	try{
		obj.throwOutOfBounds();
		fail("Should have thrown an IndexOutOfBoundsException");
	}
	catch(IndexOutOfBoundsException e){
		System.out.println("Correctly thrown : "+ e.getMessage());
	}
	catch(Exception e){
		fail("Incorrect Exception, should have thrown an IndexOutOfBoundsException");
	}
	}
}
