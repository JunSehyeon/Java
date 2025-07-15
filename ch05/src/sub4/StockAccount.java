package sub4;

public class StockAccount {
	
	private String bank;
	private String id;
	private String name;
	private int balance;
	private String stock;
	private int amount;
	private int price;

	public StockAccount(String bank, String id, String name, int balance, String stock, int amount) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.stock = stock;
		this.amount = amount;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	public void show() {
		System.out.println("은행명 : " + bank);
		System.out.println("계좌번호 : " + id);
		System.out.println("예금주 : " + name);
		System.out.println("잔액 : " + balance + "원");
		System.out.println("주식명 : " + stock);
		System.out.println("보유수량 : " + amount + "주");
		System.out.println("현재가격 : " + price + "원");
		System.out.println("총 평가금액 : " + (price * amount) + "원");
	}

	// Getter / Setter (필요한 필드만 추가적으로 만들 수 있음)
	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}
