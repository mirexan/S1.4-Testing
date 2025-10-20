package Level_01.lvl1_Ex3.classes;

public class OutOfBounds {
	public void throwOutOfBounds(int impossible){
		int[] arrInt = {1,2,3,4};
			arrInt[impossible] = 5;
		}
}
