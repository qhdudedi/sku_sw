package day03;

public class GoodsApp {
	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.setName("Nijkon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCoutntSold(50);
		
		System.out.println("상품 이름 :"+ camera.getName());
	}
}
