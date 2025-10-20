package Level_02.ex1toex3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
@DisplayName("Tests for exercise 1 to 3")
public class Ex1ToEx3Tests {
	@Test
    public void aBComparatorEqual() {
		Integer a = 1;
		Integer b = 1;
		Assertions.assertThat(a).isEqualTo(b);
	}
	@Test
	public void aCComparatorNotEqual(){
		Integer a = 1;
		Integer c = 3;
		Assertions.assertThat(a).isNotEqualTo(c);
	}

	@Test
	public void	objectsCompareIsSame(){
		Object a = new Object();
		Object c = a;
		Assertions.assertThat(a).isSameAs(c);
	}

	@Test
	public void objectsCompareIsNotSame() {
		Object a = new Object();
		Object b = new Object();
		Assertions.assertThat(a).isNotSameAs(b);
	}

	@Test
	public void intArrayIsIdentical() {
		int[] arrInt1 = {1,2,3};
		int[] arrInt2 = {1,2,3};
		Assertions.assertThat(arrInt1).containsExactly(arrInt2);
	}
}
