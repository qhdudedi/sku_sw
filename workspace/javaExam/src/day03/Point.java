package day03;

public class Point {
	private int x; // private�� �ٴ� ����
	private int y;
	public Point(int x, int y) { //������
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
		System.out.printf("��ǥ[x=%d, y=%d]�� ���� �׷Ƚ��ϴ�.\n");
	}
}
