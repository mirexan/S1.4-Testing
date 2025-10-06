package Level_01.lvl1_Ex3.classes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;

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
