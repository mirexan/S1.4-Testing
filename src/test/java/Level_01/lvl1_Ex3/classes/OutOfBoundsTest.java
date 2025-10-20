package Level_01.lvl1_Ex3.classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;

public class OutOfBoundsTest {
	@Test
	public void throwOutOfBoundsTest(){
		OutOfBounds obj = new OutOfBounds();
		Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,()->obj.throwOutOfBounds(5));
	}
}
