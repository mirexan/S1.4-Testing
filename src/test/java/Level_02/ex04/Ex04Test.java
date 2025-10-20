package Level_02.ex04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class Ex04Test {
	private ArrayList<Object> fruits;
	private Apple apple;
	private Orange orange;
	private Grape grape;
	private Apple fuji;

	@BeforeEach
	@Test
	public void	makeFruitArray(){
		fruits = new ArrayList<>();
		apple = new Apple();
		orange= new Orange();
		grape= new Grape();
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
