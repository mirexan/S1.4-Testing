package Level_02.ex5toex7;

import Level_02.ex5ToEx7.ObjOutofBounds;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Optional;


public class Ex5ToEx7Test {
	@Test
	public void ex05Test(){
		HashMap<Integer,String> map= new HashMap<Integer, String>();
		map.put(1,"Sharon");
		map.put(2,"Chufi");
		assertThat(map).containsKey(2);
	}

	@Test
	public void ex06Test(){
		ObjOutofBounds obj = new ObjOutofBounds();
		String answer = obj.provokedOutOfBounds();
		assertThat(answer).startsWith("Exception catched : ");
	}

	@Test
	public void ex07Test(){
		Optional<String> obj = Optional.empty();
		assertThat(obj).isEmpty();
	}

}
