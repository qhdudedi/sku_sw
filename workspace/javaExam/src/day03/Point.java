package day03;

public class Point {
	private int x; // private이 붙는 이유
	private int y;
	public Point(int x, int y) { //생성자
		this.x = x;
		this.y = y;
	}
	public Point() {
	
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void show() {
		System.out.printf("좌표[x=%d, y=%d]에 점을 그렸습니다.\n");
	}
}
