package Level_03.Lvl3_Ex01;

public class ObjOutofBounds {
	public String provokedOutOfBounds() {
		String answer = "";
		int[] numbers = {1,2,3};
		try {
			numbers[4] = 5;
			answer = "without an exception catch";
		}
		catch (IndexOutOfBoundsException e){
			answer = "Exception catched : " + e.getMessage();
		}
		return answer;
	}
}
