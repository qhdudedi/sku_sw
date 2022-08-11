package project;
import java.util.Random;

public class 로또머신 {
	private int ball_num;
	private int index;
	
	Random rd = new Random();
	
	public void 번호섞기(int[] ball) {
		index = rd.nextInt(45);
	}
}
