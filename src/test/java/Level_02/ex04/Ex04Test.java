package Level_02.ex04;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class Ex04Test {
	static ArrayList<Object> fruits;
	static Apple apple;
	static Orange orange;
	static Grape grape;
	static Apple fuji;
	static {
		fruits = new ArrayList<Object>();
		apple = new Apple();
		orange = new Orange();
		grape = new Grape();
		fuji = new Apple();

		fruits.add(apple);
		fruits.add(orange);
		fruits.add(grape);
	}
	@Test
	public void verifyInsertionOrder() {
		assertThat(fruits).containsExactly(apple,orange, grape);
	}
	@Test
	public void verifyThatContains(){
		assertThat(fruits).containsExactlyInAnyOrder(orange,grape,apple);
	}
	@Test
	public void addedOnce(){
		assertThat(fruits).containsOnlyOnce(apple);
	}
	@Test
	public void doesNotContain(){
		assertThat(fruits).doesNotContain(fuji);
	}
}
