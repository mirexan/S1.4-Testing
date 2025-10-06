package Level_02.ex1toex3;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

public class Ex1ToEx3Tests {
	@Test
    public void exercise01Test() {
		Integer a = 1;
		Integer b = 1;
		Integer c = 3;
		Assertions.assertThat(a).isEqualTo(b);
		Assertions.assertThat(a).isNotEqualTo(c);
	}
	@Test
	public void exercise02Test() {
		Object a = new Object();
		Object b = new Object();
		Object c = a;
		Assertions.assertThat(a).isSameAs(c);
		Assertions.assertThat(a).isNotSameAs(b);
	}
	@Test
	public void exercise03Test() {
		int[] arrInt1 = {1,2,3};
		int[] arrInt2 = {1,2,3};
		Assertions.assertThat(arrInt1).containsExactly(arrInt2);
	}
}
