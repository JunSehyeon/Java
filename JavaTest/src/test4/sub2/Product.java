package test4.sub2;

public class Product {
	
	//속성명
	private String productId;
	private String productName;
	private int Price;
	private int quantity;
	
	//생성자
	public Product(String productId,String productName,int Price,int quantity) {
		this.Price=Price;
		this.productId=productId;
		this.productName=productName;
		this.quantity=quantity;
	}
	
	//메서드
	public void updatePrice(int newPrice) {
			if(newPrice>0) {
				this.Price = newPrice;
				System.out.println("가격이"+newPrice+"로 변경됨");
			}else {
				System.out.println("유효하지 않은 가격입니다");
			}
	}
	
	public void addStock(int Stock) {
			if(Stock>0) {
				this.quantity+=Stock;
				System.out.println("수량이"+Stock+"으로 변경됨");
			}else {
				System.out.println("유효하지 않은 수량입니다");
			}
	}
	
	public void printProductInfo() {
		System.out.println("상품ID:"+ productId);
		System.out.println("상품이름:"+ productName);
		System.out.println("가격:"+ Price);
		System.out.println("수량:"+ quantity);
	}
}
