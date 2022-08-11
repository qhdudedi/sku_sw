package day04;
// '새'를 상속받는 참새,앵무새,뻐꾸기
public class 새 {
	String name;
	public void 노래하다() {
		System.out.println("~가 노래한다");
	}
	/**
	abstract public void 노래하다();
	-> 노래하다를 추상적으로 구현해두면 새를 상속받는 클래스들을 노래하다 메서드를 사용할 수 있다.
	   추상 클래스는 객체 생성이 되지 않는다 => 이유: 미완성 클래스이기때문에
	**/
	}
