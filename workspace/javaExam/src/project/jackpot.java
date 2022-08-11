package project;
import java.util.Random;
// import java.util.Arrays; 

public class jackpot {
	private int[] ball = new int[6]; 	// 뽑히는 공의 숫자(배열)
	
	public int[] 번호뽑기() {
		return ball;					//뽑히는 공의 숫자 출력 함수
	}
	public void 번호섞기() {
		Random sh = new Random();

		int count=0;
		for (int i = 0; i<ball.length; i++) { // 1~45까지의 번호
			int ball_num = sh.nextInt(45) +1; // 랜덤으로 뽑기
			for( int j =0 ; i<i; j++) { 	//뽑히는 수의 중복 체크 
				if( ball[i] == ball[j]) {
					i--;
					break;
				}
			}
			ball[i++] = ball_num;
			// i++;
		}
	}
}

