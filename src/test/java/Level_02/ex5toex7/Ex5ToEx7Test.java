package Level_02.ex5toex7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.HashMap;
import java.util.Optional;

@DisplayName("Tests from Exercise 5 to 7")
public class Ex5ToEx7Test {
	@Test
	public void mapVerifyAddedKey(){
		HashMap<Integer,String> map= new HashMap<Integer, String>();
		map.put(1,"Sharon");
		map.put(2,"Chufi");
		assertThat(map).containsKey(2);
	}

	@Test
	public void objectThrowsOutOfBoundsException(){
		ObjOutofBounds obj = new ObjOutofBounds();
		assertThatThrownBy(()->obj.provokedOutOfBounds());

	}

	@Test
	public void objectVerifyIsEmpty(){
		Optional<String> obj = Optional.empty();
		assertThat(obj).isEmpty();
	}

}
